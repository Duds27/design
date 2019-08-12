/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import controller.*;
import model.Contato;
import persistence.Conexao;
import persistence.ContatoDAO;

import java.util.*;
import java.io.IOException;

/**
 *
 * @author Andreia
 */
public class DeletarContatoAction implements Action {

    public void DeletarContatoAction() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response, String id)
            throws ServletException, IOException {
        try {

            ContatoDAO cnn = ContatoDAO.getInstance();
            cnn.Delete((Integer.parseInt(id)));

            RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("index.jsp");//DeletarContatos.jsp
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
   }

 }

           
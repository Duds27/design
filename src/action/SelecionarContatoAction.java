/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.awt.TextField;
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
public class SelecionarContatoAction implements Action {

    public void SelecionarContatoAction() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response, String id)
            throws ServletException, IOException {
        
        Contato contato = new Contato();

        try {
            contato.setCodigo(Integer.parseInt(id));
            ContatoDAO cnn = ContatoDAO.getInstance();

            contato = cnn.Select((Integer.parseInt(id)));
            
            HttpSession session = request.getSession(true);
            session.setAttribute("contato", contato);

            RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("formAtuContato.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}
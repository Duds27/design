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
public class ListarContatoAction implements Action {
    

    public void ListarContatoAction() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response, String id)
            throws ServletException, IOException {
        
        
         ContatoDAO cnn = ContatoDAO.getInstance();


        try {
            if (id==null){

            List contatosList = cnn.todosContatos();
                request.setAttribute( "contatosList", contatosList );

            }

            RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("formListarContatosCads.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }

    

}

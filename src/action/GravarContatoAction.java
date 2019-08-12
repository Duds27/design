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
public class GravarContatoAction implements Action {

    public GravarContatoAction() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response, String id) throws ServletException, IOException {
        Contato cont = new Contato();

        try {
	        	{
		            cont.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		            cont.setNome(request.getParameter("nome"));
		            cont.setEmail(request.getParameter("email"));
	
		            ContatoDAO cnn = ContatoDAO.getInstance();
		            cnn.GravarContato(cont);
	            
		            RequestDispatcher rd = null;
		            rd = request.getRequestDispatcher("index.jsp");
		            rd.forward(request, response);
	            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
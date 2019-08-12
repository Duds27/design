/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import javax.servlet.*;
import javax.servlet.http.*;

import controller.*;
import model.Contato;
import persistence.ContatoDAO;

import java.io.IOException;

/**
 *
 * @author Andreia
 */
public class AlterarContatoAction implements Action {

    public void AlterarContatoAction() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response, String id) throws ServletException, IOException {
        Contato cont = new Contato();

        try {
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            
            cont.setCodigo(Integer.parseInt(id));
            cont.setNome(nome);
            cont.setEmail(email);

            ContatoDAO cnn = ContatoDAO.getInstance();
            cnn.Update(cont);
            cont = cnn.Select(cont.getCodigo());
            
            HttpSession session = request.getSession(true);
            session.setAttribute("contato", cont);
            RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}

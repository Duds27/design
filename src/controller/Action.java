/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public interface Action {
    public void execute(HttpServletRequest request, HttpServletResponse response, String id) throws ServletException, IOException;
   
}

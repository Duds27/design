<%-- 
    Document   : index
    Created on : 17/05/2010, 11:02:31
    Author     : Andreia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contato - MVC</title>
    </head>
    <body>
	    <h1>Cadastro de Contatos</h1>
        <form name="grav" action="FrontController?action=GravarContato" method="POST">
          Código: <input type="text" name="codigo" value="" />  Nome: <input type="text" name="nome" value="" /> E-mail:<input type="text" name="email" value="" />
        	<input type="submit" value="Enviar">
        </form>
    </body>
</html>

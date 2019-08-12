<%-- 
    Document   : DeletarContatos
    Created on : 23/03/2010 05:13:44
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
        <h1>Deletar Contatos</h1>
        <form name="form1" action="FrontController?action=DeletarContato" method="POST">
          Código: <br />
          <input type="text" name="codigo" value="" /><br />
          Nome: <br />
          <input type="text" name="nome" value="" /><br />
          E-mail: <br />
          <input type="text" name="email" value="" /><br />
          <input type="submit" value="Apagar" name="delete" />
        </form>
    </body>
</html>

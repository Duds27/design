<%-- 
    Document   : AlterarCadastros
    Created on : 24/03/2010, 04:33:12
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
        <h1>Alterar Contatos</h1>
        <form name="form1" action='FrontController?action=AlterarContato' method="POST">
          Código: <br />
          <input type="text" name="codigo" value="" />
          <input type="submit" value="Carregar" onclick="FrontController?action=SelecionarContato" name="SelecionarContato"/>
          <br />
          Nome: <br />
          <input type="text" name="nome" value='<%=request.getAttribute("nome")%>' /><br />
          E-mail: <br />
          <input type="text" name="email" value='<%=request.getAttribute("email")%>' /><br />
          <input type="submit" value="Alterar" name="AlterarContato" />
        </form>
    </body>
</html>

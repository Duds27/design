<%-- 
    Document   : formAtuContato
    Created on : 10/05/2011, 16:01:25
    Author     : Andreia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="contato" scope="session"
                     class="model.Contato" />
        <p>Vc esta em formAtuContato.jsp</p>
        <form action="FrontController?action=AlterarContato" method="post">
            <table>
                <tr>
                    <td>ID:</td>
                    <td>
                        <input type="text" name="id"
                            value="${contato.codigo}" readonly="readonly" />
                    </td>
                </tr>
                <tr>
                    <td>Nome:</td>
                    <td>
                        <input type="text" name="nome" value="${contato.nome}" />
                    </td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td>
                        <input type="text" name="email" value="${contato.email}" />
                    </td>
                </tr>

                <tr>
                    <td colspan="2">
                        <input type="submit" name="btAtualizar" value="Atualizar" />
                    </td>
                </tr>
            </table>
        </form>
        
    </body>
</html>

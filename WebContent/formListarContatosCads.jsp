<%@page contentType="text/html"%>
<%@page pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Mostrando contatos</title>
    </head>
    <body>
        
        <table border="1" cellpadding="2" cellspacing="0">
            <tr>
                <th>ID - Atualizar</th>
                <th>Nome</th>
                <th>E-mail</th>
                 <th>Excluir </th>
            </tr>

        <c:forEach var="lista" items="${ requestScope.contatosList }">
            <tr>
                <td>
                    <a href="FrontController?action=SelecionarContato&id=${lista.codigo}">
                        ${lista.codigo}
                </a>
                                    </td>
                <td>${lista.nome}</td>
                <td>${lista.email}</td>
               
                <td>
                    <a href="FrontController?action=DeletarContato&id=${lista.codigo}">
                        Excluir
                    </a>
                </td>
            </tr>
        
        </c:forEach>
        </table>
                <br />
        <a href="formGravarContato.jsp">Adicionar um novo Autor</a>
        <br />
        <a href="index.jsp">Página Principal</a>
    </body>
</html>

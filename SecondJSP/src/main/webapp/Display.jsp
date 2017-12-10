<%-- 
    Document   : Display
    Created on : 10/12/2017, 20:50:31
    Author     : yusha
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String[] names = {"Yusha", "Houssam", "Amine", "Felipino", "DJ Khaldi"};
    Date today; %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Second JSP</title>
    </head>
    <body>
        <% today = new Date(); %>
        <p>Hello! Date and time: <%= today %></p>
        <ul>
        <%for (String name : names) { %>
            <li><%=name.toUpperCase() %></li>
        <% } %>
        </ul>
    </body>
</html>


<%-- 
    Document   : out
    Created on : 10/12/2017, 23:19:54
    Author     : yusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attributes in Requisition</title>
    </head>
    <body>
        <p>Values received from user:</p>
        <% ArrayList<String> users = (ArrayList<String>)application.getAttribute("users");
           for (String value: users ) { %>
           <p><%= value %></p>
        <% } %>
        <form action="/AttributesContext/index.html" method="get">
            <input type="submit" value="Back">
        </form>
    </body>
</html>


<%-- 
    Document   : DisplayDate
    Created on : 10/12/2017, 20:43:37
    Author     : yusha
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My First JSP</title>
    </head>
    <body>
        <p>Hello! Date and time: <%= new Date() %></p>
        <p>Hello! Date and time: <% out.print(new Date()); %></p>
    </body>
</html>


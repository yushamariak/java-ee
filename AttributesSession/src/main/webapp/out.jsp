<%-- 
    Document   : out
    Created on : 10/12/2017, 21:48:20
    Author     : yusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Requisition in Attributes</title>
    </head>
    <body>
        <p>Text value: <%= request.getAttribute("text")%></p>
        <p>Integer value: <%= request.getAttribute("value")%></p>
        <p>Object value: <%= request.getAttribute("object")%></p>
        <p>ArrayList value: <%= request.getAttribute("arrayList")%></p>
        <p>User value: <%= request.getSession().getAttribute("user")%></p>
        <form action="/AttributesRequisition/index.html" method="get">
            <input type="submit" value="Back">
        </form>
    </body>
</html>


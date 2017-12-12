<%-- 
    Document   : out
    Created on : 11/12/2017, 15:20:15
    Author     : yusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL and JSTL</title>
    </head>
    <body>
        <h1>Registered Users</h1><br><br>
        <c:forEach var="user" items="${users}" varStatus="controleLacoExt">
            <table width="400">
                <tr> <td colspan="4" bgcolor="#ececec"> <h3> Person's Data </h3> </td> </tr>
                <tr> <td> User</td> <td>  ${controleLacoExt.count} </td> </tr>
                <tr> <td> Name:</td> <td>  ${users.name} </td> </tr>
                <tr> <td> Adress:</td> <td>  ${users.adress} </td> </tr>
                <tr> <td> Sex:</td> <td>  ${users.sex} </td> </tr>
                <tr> <td> Birth Date:</td> <td>  ${users.birthDate} </td> </tr>
                <tr> <td> Phone(s):</td>
                    <td>
                        <c:forEach var="phone" items="${users.phones}" varStatus="controleLacoInt1">
                            ${controleLacoInt1.count}: ${phone} <br>
                        </c:forEach>
                    </td> </tr>
                <tr> <td> Email(s):</td>                
                    <td>
                        <c:forEach var="email" items="${users.emails}" varStatus="controleLacoInt2">
                            ${controleLacoInt2.count}: ${email} <br>
                        </c:forEach>
                    </td> </tr>
                <tr> <td colspan="4" bgcolor="#ececec"> <h3>Dog Data</h3> </td> </tr>
                <tr> <td> Dog name: </td> <td> ${users.dog.name} </td> </tr>
                <tr> <td> Dog breed: </td> <td> ${users.dog.breed} </td> </tr>
                <tr> <td> Dog sex: </td> <td> ${users.dog.sex} </td> </tr>
            </table>
            <br> <hr size="1"> <br>
        </c:forEach>
        <br><br>
        <form action="/EL_JSTL_Project/index.html" method="get">
            <input type="submit" value="Back">
        </form>
    </body>
</html>


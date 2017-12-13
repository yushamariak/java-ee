<%-- 
    Document   : responseAjaxJQueryCompleteForm
    Created on : 12/12/2017, 22:09:41
    Author     : yusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Users Registered</h1><br><br>
<c:forEach var="user" items="${users}" varStatus="controleLacoExt">
    <table width="400">
        <tr> <td colspan="4" bgcolor="#ececec"> <h3> Person Registration </h3> </td> </tr>
        <tr> <td> User:</td> <td>  ${controleLacoExt.count} </td> </tr>
        <tr> <td> Name:</td> <td>  ${user.name} </td> </tr>
        <tr> <td> Adress:</td> <td>  ${user.adress} </td> </tr>
        <tr> <td> Sex:</td> <td>  ${user.sexo} </td> </tr>
        <tr> <td> Birth Date:</td> <td>  ${user.birthDate} </td> </tr>
        <tr> <td> Phone(s):</td>
            <td>
                <c:forEach var="phone" items="${user.phones}" varStatus="controleLacoInt1">
                    ${controleLacoInt1.count}: ${phone} <br>
                </c:forEach>
            </td> </tr>
        <tr> <td> Email(s):</td>                
            <td>
                <c:forEach var="email" items="${user.emails}" varStatus="controleLacoInt2">
                    ${controleLacoInt2.count}: ${email} <br>
                </c:forEach>
            </td> </tr>
        <tr> <td colspan="4" bgcolor="#ececec"> <h3>Dog Registration</h3> </td> </tr>
        <tr> <td> Dog name: </td> <td> ${user.dog.name} </td> </tr>
        <tr> <td> Dog Breed: </td> <td> ${user.dog.breed} </td> </tr>
        <tr> <td> Dog sex: </td> <td> ${user.dog.sex} </td> </tr>
    </table>
    <br> <hr size="1"> <br>
</c:forEach>

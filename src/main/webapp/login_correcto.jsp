<%@ page import="org.example.iniciosesion.usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Ingreso correcto</title>
</head>
<body>
<table style="with: 50%">
    <tr>
        <td>
            <% String nombreUs = (String) request.getAttribute("nombreU");%>
            <% String textMayus = nombreUs.toUpperCase();%>
            <a> Bienvenido  <%= textMayus %> Su inicio de sesión es correcto!!!.</a>

        </td>

        <td>
            <br>
            <% String mensajeUs = (String) request.getAttribute("mensaje");%>
            <% String menMayus = mensajeUs.toUpperCase();%>

            <a> <%= menMayus %></a >

        </td>
    </tr>
    <tr></tr>
    <tr><td>
        <a href="index.jsp"><b>Cerrar sesión</b></a>
    </td>
    </tr>
</table>
</body>
</html>
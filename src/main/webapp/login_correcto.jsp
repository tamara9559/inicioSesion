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
            <!-- Se toman ls valores que viene y se asignan a una variable -->
            <% usuario nombreUs = (usuario) request.getAttribute("nombreUsuario");%>
            <!-- Se concatena HTML con codigo Java -->
            <a>Bienvenid@   <%=nombreUs.getUsuario() %> Su inicio de sesión es correcto!!!.</a>
        </td>
    </tr>
    <tr></tr>
    <tr><td>
        <a href="inicio_login.jsp"><b>Cerrar sesión</b></a>
    </td>
    </tr>
</table>
</body>
</html>
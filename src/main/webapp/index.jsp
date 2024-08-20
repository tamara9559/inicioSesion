<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Formulario de registro</title>
</head>
<body>
<!-- Se hace un formulario de HTML normal -->
<h1>Formulario para registro de usuarios.</h1>
<form action="registro" method="post">
    <table style="with: 50%">
        <tr>
            <td>Nombres:</td>
            <td><input type="text" name="textNombres" id="textNombres"/></td>
        </tr>
        <tr>
            <td>Apellidos:</td>
            <td><input type="text" name="taxtApellidos" id="textApellidos"/></td>
        </tr>
        <tr>
            <td>Usuario:</td>
            <td><input type="text" name="textUsuario" id="textUsuario"/></td>
        </tr>
        <tr>
            <td>Clave:</td>
            <td><input type="password" name="passClave" id="passClave"/></td>
        </tr>
        <tr>
            <td>Direccion</td>
            <td><input type="text" name="textDireccion" id="textDireccion"/></td>
        </tr>
        <tr>
            <td>Movil nro:</td>
            <td><input type="number" name="numMovil" id="numMovil"/></td>
        </tr></table>
    <input type="submit" value="Registrar" /></form>
</body>
</html>

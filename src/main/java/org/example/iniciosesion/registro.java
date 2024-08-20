package org.example.iniciosesion;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
// Importante la anotación
@WebServlet(value = "/registro")
//Aquí definimos registro que extiende HttpServlet.
public class registro extends HttpServlet {

    // Esta acción doPost() método que se llamará cuando mencionemos el atributo POST en acción en el formulario JSP anterior
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí obtenemos los valores de la solicitud

        String nombres = request.getParameter("textNombres");
        String apellidos = request.getParameter("textApellidos");
        String Usuario = request.getParameter("textUsuario");
        String clave = request.getParameter("passClave");
        String direcion = request.getParameter("textDireccion");
        String movilStr = request.getParameter("numMovil");

        Integer movil = Integer.parseInt(movilStr);

        usuario Usuario1 = new usuario(nombres,apellidos,Usuario,clave,direcion,movil);

        HttpSession session = request.getSession();
        session.setAttribute("usuario1", Usuario1);


        // Aquí estamos tomando la condición if donde verificamos que cualquiera de los parámetros que se obtienen de la solicitud esté vacío o no
        if(nombres.isEmpty() || apellidos.isEmpty() || Usuario.isEmpty() || clave.isEmpty() || direcion.isEmpty() || movilStr.isEmpty())
        {
            // Esta manera de llamar a la otra página es igual a la que hay en el else
            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
            req.include(request, response);
        }
        else //Este caso se ejecutará cuando alguno de los parámetros no esté vacío
        {
            // Se arma un mensaje a enviar a la página donde se redirecciona.
            request.setAttribute("mensaje", "Registro exitoso para " + Usuario + " (" + clave + ")");
            // Redirigir a la página JSP
            request.getRequestDispatcher("confirma_registro.jsp").forward(request, response);
        }
    }
}
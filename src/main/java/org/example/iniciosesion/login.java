package org.example.iniciosesion;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(value = "/login")
// Aquí estamos tomando el servlet login que extiende HttpServlet.
public class login extends HttpServlet {

    // Aquí estamos usando doPost() método como en el formulario que estamos usando el método POST.
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // Se toman parámetros utilizando el objeto de solicitud, es decir, nombre de usuario y contraseña.

        String usuariO = request.getParameter("textUsuario");
        String clave = request.getParameter("passClave");

        HttpSession session = request.getSession();
        usuario usurioSe = (usuario) session.getAttribute("usuario1");

        boolean validarUsu = usurioSe.getUsuario().equals(usuariO);
        boolean validarCl = usurioSe.getClave().equals(clave);


        // Si los campos están vacíos se solicitan de nuevo
        if (validarUsu && validarCl ){
            RequestDispatcher req=request.getRequestDispatcher("login_correcto.jsp");
            req.forward(request,response);
            request.setAttribute("nombreUsuario", usurioSe);
        }else {
            RequestDispatcher req=request.getRequestDispatcher("inicio_login.jsp");
            req.include(request,response);

        }
    }
}

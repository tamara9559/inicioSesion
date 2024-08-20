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

public class login extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String usuariO = request.getParameter("textUsuario");
        String clave = request.getParameter("passClave");

        HttpSession session = request.getSession();
        usuario usurioSe = (usuario) session.getAttribute("usuario1");

        boolean validarUsu = usurioSe.getUsuario().equals(usuariO);
        boolean validarCl = usurioSe.getClave().equals(clave);


        if (validarUsu && validarCl ){
            String nombreusu = usurioSe.getUsuario();
            String mensaje = usurioSe.toString();
            request.setAttribute("nombreU", nombreusu);
            request.setAttribute("mensaje",mensaje);
            RequestDispatcher req=request.getRequestDispatcher("login_correcto.jsp");
            req.forward(request,response);

        }else {
            RequestDispatcher req=request.getRequestDispatcher("inicio_login.jsp");
            req.include(request,response);

        }
    }
}

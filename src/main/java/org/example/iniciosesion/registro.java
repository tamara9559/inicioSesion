package org.example.iniciosesion;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(value = "/registro")

public class registro extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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


        if(nombres.isEmpty() || apellidos.isEmpty() || Usuario.isEmpty() || clave.isEmpty() || direcion.isEmpty() || movilStr.isEmpty())
        {
            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
            req.include(request, response);
        }
        else
        {

            request.setAttribute("mensaje", "Registro exitoso para " + Usuario + " (" + clave + ")");
            request.getRequestDispatcher("confirma_registro.jsp").forward(request, response);
        }
    }
}
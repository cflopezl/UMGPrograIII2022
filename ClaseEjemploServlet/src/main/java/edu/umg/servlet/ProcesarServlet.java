package edu.umg.servlet;

import edu.umg.model.Criptomoneda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ProcesarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //recoger la informacion del cliente
        Criptomoneda datosEntrada = new Criptomoneda(request.getParameter("nombre"),
                request.getParameter("acronimo"));

        //agregarle el valor de la cripto
        datosEntrada.setValor(40000);

        //trasladar los datos obtenidos a Resultado.jsp
        request.setAttribute("data", datosEntrada);
        request.getRequestDispatcher("Resultado.jsp").forward(request,response);

    }

}

package org.c19HolaMundoMVC.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.c19HolaMundoMVC.Model.OperacionesModel;

/**
 * Servlet implementation class RestasController
 */
@WebServlet(description = "Servlet Controlador para funcion de Restas", urlPatterns = { "/RestasController" })
public class RestasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestasController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		OperacionesModel miResta = new OperacionesModel();
		
		int numero1;
		int numero2;
		
		int restaTotal;
		
		//Leer y asignar el valor de usuario para numeros
		numero1 = Integer.parseInt(request.getParameter("nume1res"));
		numero2 = Integer.parseInt(request.getParameter("nume2res"));
		
		//Setear los valores del objeto
		
		miResta.setNumero1(numero1);
		miResta.setNumero2(numero2);
		
		restaTotal = miResta.resta();
		//Mostrar los valores
		response.getWriter().append("La resta es: " + restaTotal + "\nNumero 1: " + numero1 + "\nNumero 2: " + numero2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package org.c19HolaMundoMVC.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.c19HolaMundoMVC.Model.OperacionesModel;


// ESTE ES EL SERVLET
/**
 * Servlet implementation class CalculadoraController
 */
@WebServlet(description = "Servlet de la calculadora, suma y resta", urlPatterns = { "/CalculadoraController" })
public class CalculadoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		OperacionesModel miSumita;
		miSumita = new OperacionesModel();
		
		int numero1;
		int numero2;
		
		
		
		numero1 = Integer.parseInt(request.getParameter("num1"));
		numero2 = Integer.parseInt(request.getParameter("num2"));
		
		miSumita.setNumero1(numero1);
		miSumita.setNumero2(numero2);
		
		//miSumita.Sumita();
		
		response.getWriter().append("La suma es: " + (miSumita.sumita()) + "\n Numero 1: " + miSumita.getNumero1() + "\n Numero 2: " + (miSumita.getNumero2()));
	}
	
	

}

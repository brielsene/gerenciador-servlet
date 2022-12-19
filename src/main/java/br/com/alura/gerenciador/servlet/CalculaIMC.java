package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculaIMC
 */
@WebServlet("/calculaIMC")
public class CalculaIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		request.getParameter("peso");
		request.getParameter("altura");
		
		double peso = Double.parseDouble(request.getParameter("peso"));
//		int peso1 = Integer.parseInt(peso);
		double altura = Double.parseDouble(request.getParameter("altura"));
		
		double calculoIMC = (peso/(altura * 2));
		
		
		out.println("<html><body> IMC: "+calculoIMC+ "</body></html>");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

}

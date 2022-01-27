package com.br.projeto.triangulo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Triangulo
 */
@WebServlet("/Triangulo")
public class Triangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Triangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int valor1 = Integer.parseInt(request.getParameter("valor1"));
		int valor2 = Integer.parseInt(request.getParameter("valor2"));
		int valor3 = Integer.parseInt(request.getParameter("valor3"));
		

		else{
				if(valor1 != valor2 && valor2 != valor3 && valor3 != valor1){
					response.getWriter().println("Isso � um triangulo escaleno!");
				}else if(valor1 == valor2 && valor2 == valor3 && valor3 == valor1) {
					response.getWriter().println(" Isso � um triangulo equilatero!");
				}else {
					response.getWriter().println(" Isso � triangulo escaleno!");
				}
			}
	
			
			
		
		}

	}

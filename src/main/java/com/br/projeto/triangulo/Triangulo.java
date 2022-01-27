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
		
		if(valor1 <= 0 && valor2 <= 0 && valor3 <= 0) {
			response.getWriter().println("Digite valores validos!");
			
		
		}else if(valor2 <= 0 && valor3 <= 0 || valor1 <= 0 || valor2 <= 0 && valor1 <= 0) {
			response.getWriter().println(" Isso é uma reta!");
			
		
		}else if(valor1 >0 && valor2 >0 && valor3 <= 0 || valor3 >0 &&  valor1 >0 && valor2 <=0 || valor3 >0 && valor2 >0 && valor1 <=0) {
			if(valor1 == valor2 && valor2 == valor3 && valor1 == valor2) {
				response.getWriter().println(" Isso é um Quadrado!");
				
			}else {
			response.getWriter().println(" Isso é um Retangulo!");
			
			
		}
		}
		else{
				if(valor1 != valor2 && valor2 != valor3 && valor3 != valor1){
					response.getWriter().println("Isso é um triangulo escaleno!");
				}else if(valor1 == valor2 && valor2 == valor3 && valor3 == valor1) {
					response.getWriter().println(" Isso é um triangulo equilatero!");
				}else {
					response.getWriter().println(" Isso é triangulo escaleno!");
				}
			}
	
			
			
		
		}

	}

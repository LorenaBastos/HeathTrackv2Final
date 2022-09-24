package br.com.healthtrack.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.BO.Usuario;

/**
 * Servlet implementation class EsqueciASenha
 */
@WebServlet("/EsqueciASenha")
public class EsqueciASenhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EsqueciASenhaServlet() {
        super();
        // TODO Auto-generated constructor stub
		
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request
		  .getRequestDispatcher("/esqueci.jsp")
		  .forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emailLogin = request.getParameter("emailLogin");
		
		Usuario usuario = new Usuario();
		usuario.setEmailLogin(emailLogin);
		
		// Importante
				request.setAttribute("usuarioAttr", usuario);
				
				request
				.getRequestDispatcher("/esqueciSucesso.jsp")
				.forward(request, response);
	}

}

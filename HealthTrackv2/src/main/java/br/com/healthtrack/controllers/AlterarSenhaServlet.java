package br.com.healthtrack.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.BO.Usuario;
import br.com.healthtrack.DAO.UsuarioDAO;

/**
 * Servlet implementation class AlterarSenha
 */
@WebServlet("/AlterarSenha")
public class AlterarSenhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AlterarSenhaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request
		  .getRequestDispatcher("/alterarSenha.jsp")
		  .forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setSenha(senha);
		
		System.out.println(senha);
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.add(usuario);
		
		
		usuario.setIdUsuario(1); 
		
		// Importante
		request.setAttribute("usuarioAttr", usuario);
		
		request
			.getRequestDispatcher("/senhaAlterada.jsp");
		
		
	}

}

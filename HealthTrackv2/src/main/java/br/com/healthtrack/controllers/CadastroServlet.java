package br.com.healthtrack.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.BO.Usuario;
import br.com.healthtrack.DAO.UsuarioDAO;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
 
        } finally {            
            out.close();
        }
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request
		 .getRequestDispatcher("/cadastro.jsp")
		.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String dataNascimento = request.getParameter("dataDeNascimento");
		String emailLogin = request.getParameter("emailLogin");
		String genero = request.getParameter("genero");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setCpf(cpf);
		usuario.setDataNascimento(dataNascimento);
		usuario.setEmailLogin(emailLogin);
		usuario.setGenero(genero);
		usuario.setSenha(senha);
		
		System.out.println(nome);
		System.out.println(dataNascimento);
		System.out.println(emailLogin);
		System.out.println(genero);
		System.out.println(senha);
		
		UsuarioDAO ul = new UsuarioDAO();
		ul.add(usuario);
		
		
		usuario.setIdUsuario(1); 
		
		// Importante
		request.setAttribute("usuarioAttr", usuario);
		
		request
			.getRequestDispatcher("/cadastroRealizado.jsp")
			.forward(request, response);
	}

}

package br.com.healthtrack.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.healthtrack.BO.Usuario;
import br.com.healthtrack.DAO.UsuarioDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
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

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        RequestDispatcher rd = null;
        Usuario ul = new Usuario();
        ul.setNome(nome);
        ul.setSenha(senha);
        UsuarioDAO uc = new UsuarioDAO();
        if(uc.verificaUsuario(ul))
        {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("nome",ul);
            rd=request.getRequestDispatcher("Dashboard.jsp");
            rd.forward(request,response);
        }
        else
        {
            request.setAttribute("msg","Nome ou senha incorretos");
            rd=request.getRequestDispatcher("loginNegado.jsp");
            rd.forward(request,response);
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request,response);
    }

    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

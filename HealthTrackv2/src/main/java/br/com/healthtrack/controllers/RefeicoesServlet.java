package br.com.healthtrack.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.BO.Nutricao;
import br.com.healthtrack.DAO.NutricaoDAO;

/**
 * Servlet implementation class Refeicoes
 */
@WebServlet("/Refeicoes")
public class RefeicoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RefeicoesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request
		  .getRequestDispatcher("/adicionarRefeicoes.jsp")
		  .forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tipoRefeicao = request.getParameter("tipoRefeicao");
		String qtdKcal = request.getParameter("qtdKcal");
		String dtRefeicao = request.getParameter("dtRefeicao");
		String dieta = request.getParameter("dieta");
		
		Nutricao nutricao = new Nutricao();
		nutricao.setTipoRefeicao(tipoRefeicao);
		nutricao.setQtdKcal(qtdKcal);
		nutricao.setDtRefeicao(dtRefeicao);
		nutricao.setDieta(dieta);
		
		System.out.println(tipoRefeicao);
		System.out.println(qtdKcal);
		System.out.println(dtRefeicao);
		System.out.println(dieta);
		
		NutricaoDAO dao = new NutricaoDAO();
		dao.add(nutricao);
		
		nutricao.setIdNutricao(1); 
		
		// Importante
		request.setAttribute("usuarioAttr", nutricao);
		
		request
		.getRequestDispatcher("/refeicaoSucesso.jsp")
		.forward(request, response);
	}

}

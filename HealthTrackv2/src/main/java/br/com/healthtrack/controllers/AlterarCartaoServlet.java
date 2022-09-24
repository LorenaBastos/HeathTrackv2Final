package br.com.healthtrack.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.BO.ContaPremium;
import br.com.healthtrack.DAO.ContaPremiumDAO;

/**
 * Servlet implementation class AlterarCartao
 */
@WebServlet("/AlterarCartao")
public class AlterarCartaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarCartaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request
		  .getRequestDispatcher("/AlterarCartao.jsp")
		  .forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nrCartao = request.getParameter("nrCartao");
		String nmCartao = request.getParameter("nmCartao");
		String dtCartao = request.getParameter("dtCartao");
		int pinCartao = new Integer(request.getParameter("pinCartao"));
		
		
		ContaPremium contaPremium = new ContaPremium();
		contaPremium.setNrCartao(nrCartao);
		contaPremium.setNmCartao(nmCartao);
		contaPremium.setDtCartao(dtCartao);
		contaPremium.setPinCartao(pinCartao);
		
		
		System.out.println(nrCartao);
		System.out.println(nmCartao);
		System.out.println(dtCartao);
		System.out.println(pinCartao);
		
		ContaPremiumDAO dao = new ContaPremiumDAO();
		dao.add(contaPremium);
		
		
		
		// Importante
		request.setAttribute("usuarioAttr", contaPremium);
		
		request
			.getRequestDispatcher("/cartaoAlterado.jsp")
			.forward(request, response);
	}

}

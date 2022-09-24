package br.com.healthtrack.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.BO.Medidas;
import br.com.healthtrack.DAO.MedidasDAO;

/**
 * Servlet implementation class InserirMedidas
 */
@WebServlet("/InserirMedidas")
public class InserirMedidasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirMedidasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request
		  .getRequestDispatcher("/adicionarMedidas.jsp")
		  .forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String peso = request.getParameter("peso");
		String totalQuilosPerdidos = request.getParameter("totalQuilosPerdidos");
		String altura = request.getParameter("altura");
		String imc = request.getParameter("imc");
		String dataPesagem = request.getParameter("dataPesagem");
		String pressaoArterial = request.getParameter("pressaoArterial");
		
		Medidas medidas = new Medidas();
		medidas.setPeso(peso);
		medidas.setTotalQuilosPerdidos(totalQuilosPerdidos);
		medidas.setAltura(altura);
		medidas.setImc(imc);
		medidas.setDataPesagem(dataPesagem);
		medidas.setPressaoArterial(pressaoArterial);
		
		MedidasDAO dao = new MedidasDAO();
		dao.add(medidas);
		
		
		medidas.setIdMedidas(1); 
		
		// Importante
		request.setAttribute("usuarioAttr", medidas);
		
		request
			.getRequestDispatcher("/MedidaAdicionadaSucesso.jsp")
			.forward(request, response);
		
	}


}

package br.com.healthtrack.BO;

import java.util.List;

import br.com.healthtrack.DAO.MedidasDAO;
import br.com.healthtrack.DAO.NutricaoDAO;

public class Nutricao {
	private int idNutricao;
	private String tipoRefeicao;
	private int qtdKcalDiarias;
	private String qtdKcal;
	private String dtRefeicao;
	private String dieta;
	private Usuario usuarioUm = new Usuario();
	
	public Usuario getUsuarioUm() {
		return usuarioUm;
	}
	public void setUsuarioUm(Usuario usuarioUm) {
		this.usuarioUm = usuarioUm;
	}
	public int getIdNutricao() {
		return idNutricao;
	}
	public void setIdNutricao(int idNutricao) {
		this.idNutricao = idNutricao;
	}
	public String getTipoRefeicao() {
		return tipoRefeicao;
	}
	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}
	public String getQtdKcal() {
		return qtdKcal;
	}
	public void setQtdKcal(String qtdKcal) {
		this.qtdKcal = qtdKcal;
	}
	public String getDtRefeicao() {
		return dtRefeicao;
	}
	public void setDtRefeicao(String dtRefeicao) {
		this.dtRefeicao = dtRefeicao;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public int getQtdKcalDiarias() {
		return qtdKcalDiarias;
	}
	public void setQtdKcalDiarias(int qtdKcalDiarias) {
		this.qtdKcalDiarias = qtdKcalDiarias;
	}
	protected void somarKcalDiarias() {
//		if (dtRefeicao.equals(dtRefeicao))qtdKcalDiarias = qtdKcal ++;
	}	
	@Override
	public String toString() {
		return "Nutricao [idNutricao=" + idNutricao + ", tipoRefeicao=" + tipoRefeicao + ", qtdKcal=" + qtdKcal
				+ ", dtRefeicao=" + dtRefeicao + ", dieta=" + dieta + usuarioUm + "]";
	}
	
	public List<Nutricao> VisualizaNutricao() {
		NutricaoDAO mDAO = new NutricaoDAO();
		return mDAO.Getall();
	}

	public Nutricao SelecionaNutricao(String id) {
		NutricaoDAO mDAO = new NutricaoDAO();
		return mDAO.GetById(id);

	}

//	public int RemoveNutricaoint id) {
//		NutricaoDAO mDAO = new NutricaoDAO();
//		return mDAO.Delete(id);
//	}

	public int AtualizaNutricao() {
		NutricaoDAO mDAO = new NutricaoDAO();
		return mDAO.Update(this);
	}
}

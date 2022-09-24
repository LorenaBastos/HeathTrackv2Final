package br.com.healthtrack.BO;

import java.util.List;

import br.com.healthtrack.DAO.ContaPremiumDAO;
import br.com.healthtrack.DAO.MedidasDAO;

public class ContaPremium extends Usuario {
	private String nrCartao;
	private String nmCartao;
	private String dtCartao;
	private int pinCartao;
	private Usuario usuarioUm = new Usuario();
	
	public Usuario getUsuarioUm() {
		return usuarioUm;
	}
	public void setUsuarioUm(Usuario usuarioUm) {
		this.usuarioUm = usuarioUm;
	}
	public String getNrCartao(){
		return nrCartao;
	}
	public void setNrCartao(String nrCartao) {
		this.nrCartao = nrCartao;
	}
	public String getNmCartao() {
		return nmCartao;
	}
	public void setNmCartao(String nmCartao) {
		this.nmCartao = nmCartao;
	}
	public String getDtCartao() {
		return dtCartao;
	}
	public void setDtCartao(String dtCartao) {
		this.dtCartao = dtCartao;
	}
	public int getPinCartao() {
		return pinCartao;
	}
	public void setPinCartao(int pinCartao) {
		this.pinCartao = pinCartao;
	}
	
	public String toString() {
		return "ContaPremium [nrCartao=" + nrCartao+ ", nmCartao=" + nmCartao + ", dtCartao=" + dtCartao
				+ ", pinCartao=" + pinCartao + ", nmCPF " + usuarioUm + "]";
	}
	
	public List<ContaPremium> VisualizaContaPremium() {
		ContaPremiumDAO mDAO = new ContaPremiumDAO();
		return mDAO.Getall();
	}

	public ContaPremium SelecionaContaPremium(String id) {
		ContaPremiumDAO mDAO = new ContaPremiumDAO();
		return mDAO.GetById(id);

	}

	public int RemoveContaPremium(int id) {
		ContaPremiumDAO mDAO = new ContaPremiumDAO();
		return mDAO.Delete(id);
	}

	public int AtualizaContaPremium() {
		ContaPremiumDAO mDAO = new ContaPremiumDAO();
		return mDAO.Update(this);
	}
}

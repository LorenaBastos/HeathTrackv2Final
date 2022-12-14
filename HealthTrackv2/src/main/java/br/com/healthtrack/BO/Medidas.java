package br.com.healthtrack.BO;

import java.sql.Date;
import java.util.List;

import br.com.healthtrack.DAO.MedidasDAO;

/* A classe peso armazena as informa??es de descri??o do peso, quilos perdidos, total dos quilos perdidos e a data
 */

public class Medidas {
	private int idMedidas;
	private String peso;
	private String totalQuilosPerdidos;
	private String dataPesagem;
	private String altura;
	private String imc;
	private String pressaoArterial;
	private Usuario usuarioUm = new Usuario();
		
	public int getIdMedidas() {
		return idMedidas;
	}
	public void setIdMedidas(int idMedidas) {
		this.idMedidas = idMedidas;
	}
	public String getPressaoArterial() {
		return pressaoArterial;
	}
	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}
	public String getImc() {
		return imc;
	}
	public void setImc(String imc) {
		this.imc = imc;
	}
	public String getPeso() {
		return peso;
	}
	public Usuario getUsuarioUm() {
		return usuarioUm;
	}
	public void setUsuarioUm(Usuario usuarioUm) {
		this.usuarioUm = usuarioUm;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getTotalQuilosPerdidos() {
		return totalQuilosPerdidos;
	}
	public void setTotalQuilosPerdidos(String totalQuilosPerdidos) {
		this.totalQuilosPerdidos = totalQuilosPerdidos;
	}
	public String getDataPesagem() {
		return dataPesagem;
	}
	public void setDataPesagem(String dataPesagem) {
		this.dataPesagem = dataPesagem;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String d) {
		this.altura = d;
	}
	/* O met?do CalcularPeso() recebe os dados de descricaoPeso, quilosPerdidos e calcula o total de quilos perdidos na vari?vel totalQuilosPerdidos
	 */
		public void calcularPeso(float peso, float novoPeso,float totalQuilosPerdidos, float setTotalQuilosPerdidos) {
		    float y = peso - novoPeso;
//		    setTotalQuilosPerdidos(y);
			if (totalQuilosPerdidos < 0) {
			System.out.println("Voce Ganhou " + getTotalQuilosPerdidos() + " Kg");}
			else if (totalQuilosPerdidos == 0) {
			System.out.println("Voce N?o perdeu nem ganhou quilos");}
			if (totalQuilosPerdidos > 0) {
			System.out.println("Voce Perdeu " + getTotalQuilosPerdidos() + " Kg");}
		}
	/*O met?do adicionarDataPeso recebe a informa??o de data do dia*/

		public void adicionarDataPeso(Date getDataPesagem) {
			System.out.println("Foi adicionado a data " + getDataPesagem());
		}
	/* Metodo para calculo do IMC */
		
		public void calcularImc (double setImc) {
//			double t = altura * altura ;
//			double w = peso/t;
//			setImc(w);
			System.out.printf("Seu IMC ? " + getImc());
		}
	    	
		@Override
		public String toString() {
			return "Medidas [idMedidas=" + idMedidas + ", peso=" + peso + ", totalQuilosPerdidos=" + totalQuilosPerdidos
					+ ", dataPesagem=" + dataPesagem + ", altura=" + altura + ", imc=" + imc + ", pressaoArterial="
					+ pressaoArterial + ", nmCPF " + usuarioUm + "]";
		}
		
		public List<Medidas> VisualizaMedidas() {
			MedidasDAO mDAO = new MedidasDAO();
			return mDAO.Getall();
		}

		public Medidas SelecionaMedidas(String id) {
			MedidasDAO mDAO = new MedidasDAO();
			return mDAO.GetById(id);

		}

		public int RemoveMedidas(int id) {
			MedidasDAO mDAO = new MedidasDAO();
			return mDAO.Delete(id);
		}

		public int AtualizaMedidas() {
			MedidasDAO mDAO = new MedidasDAO();
			return mDAO.Update(this);
		}
}
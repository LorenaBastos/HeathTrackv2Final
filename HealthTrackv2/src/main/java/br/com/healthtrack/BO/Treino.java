package br.com.healthtrack.BO;

import java.util.List;

import br.com.healthtrack.DAO.MedidasDAO;
import br.com.healthtrack.DAO.TreinoDAO;

/* A classe Treino armazena as informações da duração do treino, quantidade de exercicios, nome, repetição dos exercicios
 * e o nome */

public class Treino {
	private int idTreino;
	private float duracao;
	private int quantExercicio;
	private String descricao;
	private String nomeTreino;
	private int repeticaoTreino;
	private Exercicio exercicioUm = new Exercicio();
	private Usuario usuarioUm = new Usuario ();
			
	public int getIdTreino() {
		return idTreino;
	}
	public void setIdTreino(int idTreino) {
		this.idTreino = idTreino;
	}
	public Exercicio getExercicioUm() {
		return exercicioUm;
	}
	public void setExercicioUm(Exercicio exercicioUm) {
		this.exercicioUm = exercicioUm;
	}
	public Usuario getUsuarioUm() {
		return usuarioUm;
	}
	public void setUsuarioUm(Usuario usuarioUm) {
		this.usuarioUm = usuarioUm;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	public int getQuantExercicio() {
		return quantExercicio;
	}
	public void setQuantExercicio(int quantExercicio) {
		this.quantExercicio = quantExercicio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeTreino() {
		return nomeTreino;
	}
	public void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}
	public int getRepeticaoTreino() {
		return repeticaoTreino;
	}
	public void setRepeticaoTreino(int repeticaoTreino) {
		this.repeticaoTreino = repeticaoTreino;
	}
	
	/* O metódo criarTreino() informa que o exercicio foi criado */
	
	public static void criarTreino () {
		System.out.println("Treino criado com sucesso!");
	}
	
	@Override
	public String toString() {
		return "Treino [idTreino=" + idTreino + ",= duracao=" + duracao + ", quantExercicio=" + quantExercicio
				+ ", descricao=" + descricao + ", nomeTreino=" + nomeTreino + ", repeticaoTreino=" + repeticaoTreino + ", nmCPF " + usuarioUm + "]";
	}
	
	public List<Treino> VisualizaTreino() {
		TreinoDAO mDAO = new TreinoDAO();
		return mDAO.Getall();
	}

	public Treino SelecionaTreino(String id) {
		TreinoDAO mDAO = new TreinoDAO();
		return mDAO.GetById(id);

	}

	public int RemoveTreino(int id) {
		TreinoDAO mDAO = new TreinoDAO();
		return mDAO.Delete(id);
	}

	public int AtualizaTreino() {
		TreinoDAO mDAO = new TreinoDAO();
		return mDAO.Update(this);
	}
	
}

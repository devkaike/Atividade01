package aaaaaa;

public class Funcionario {
	String nome, salario, gratificacao, seq;

	public Funcionario(String sequencia, String nome2, String salario2, String gratificacao2) {
		seq = sequencia;
		nome = nome2;
		salario = salario2;
		gratificacao  = gratificacao2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(String gratificacao) {
		this.gratificacao = gratificacao;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}
}

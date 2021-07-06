package bytebank;

public class Funcionario {
	//Atributos
	private String nome;
	private String cpf;
	private double salario;
	
	//Construtores
	public Funcionario() {
		this("Nome", "CPF", 1100);
	}
	public Funcionario(String nome, String cpf, double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}
	
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	// toString
	public String toString() {
		return "\nNome: "        + getNome() +
			   "\nCPF: "         + getCpf() +
			   "\nSalário: "     + getSalario() +
			   "\nBonificação: " + getBonificacao();
	}
}

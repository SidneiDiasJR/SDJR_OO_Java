package bytebank;

public class Cliente {
	//Atributos
	private String nome;
	private String cpf;
	private String profissao;
	
	//Construtores
	public Cliente(String nome, String cpf, String profissao) {
		setNome(nome);
		setCpf(cpf);
		setProfissao(profissao);
	}
	public Cliente(String nome, String cpf) {
		this(nome, cpf, "Desempregado");
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	
	//toString
	@Override
	public String toString() {
		return "\nNome: " 	 + getNome() +
			   "\nCPF: "  	 + getCpf() +
			   "\nProfissão: " + getProfissao();
	}
}

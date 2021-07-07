package bytebank;

public class Cliente implements Autenticavel {
	//Atributos
	private String nome;
	private String cpf;
	private String profissao;
	private int    senha;
	
	//Construtores
	public Cliente(String nome, String cpf, int senha ,String profissao) {
		setNome(nome);
		setCpf(cpf);
		setSenha(senha);
		setProfissao(profissao);
	}
	public Cliente(String nome, String cpf, int senha) {
		this(nome, cpf, senha, "Desempregado");
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
	
	//Métodos implementados
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	
	//toString
	@Override
	public String toString() {
		return "\nNome: " 	   + getNome() +
			   "\nCPF: "  	   + getCpf() +
			   "\nProfissão: " + getProfissao();
	}
}

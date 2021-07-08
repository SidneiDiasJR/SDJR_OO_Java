package bytebank;

public class Administrador extends Funcionario implements Autenticavel {
	//Atributos
	private AutenticacaoUtil autenticador;
	
	//Construtor
	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
		setSenha(senha);
	}
	
	//Bonifica��o do Administrador
	@Override
	public double getBonificacao() {
		return 20000;
	}
	
	//M�todos implementados
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	//toString
	public String toString() {
		return super.toString();
	}

}

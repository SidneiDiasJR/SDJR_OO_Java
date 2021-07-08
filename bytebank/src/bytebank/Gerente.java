package bytebank;

public class Gerente extends Funcionario implements Autenticavel {
	//Atributos
	private AutenticacaoUtil autenticador;
	
	//Construtor
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
		setSenha(senha);
	}
	
	//Bonificação do Gerente
	public double getBonificacao() {
		return super.getSalario();
	}
	
	//Métodos implementados
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

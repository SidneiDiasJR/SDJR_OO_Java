package bytebank;

public class Seguranca extends Funcionario {
	
	//Construtor
	public Seguranca(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	//Bonificação do Segurança
	
	public double getBonificacao() {
		return 150;
	}
	
	//toString
	public String toString() {
		return super.toString();
	}
}

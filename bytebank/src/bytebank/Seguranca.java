package bytebank;

public class Seguranca extends Funcionario {
	
	//Construtores
	public Seguranca(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	//getBonificacao
	
	public double getBonificacao() {
		return 150;
	}
	
	/*toString
	public String toString() {
		return super.toString();
	}*/
}

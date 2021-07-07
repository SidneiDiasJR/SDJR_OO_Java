package bytebank;

public class OperadorLimpeza extends Funcionario{
	
	//Construtor
	public OperadorLimpeza(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	//Bonificação do Operador de Limpeza
	
	public double getBonificacao() {
		return 200;
	}
	
	//toString
	public String toString() {
		return super.toString();
	}
}

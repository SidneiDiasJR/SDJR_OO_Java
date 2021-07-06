package bytebank;

public class OperadorLimpeza extends Funcionario{
	
	//Construtores
	public OperadorLimpeza(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	//getBonificacao
	
	public double getBonificacao() {
		return 200;
	}
	
	/*toString
	public String toString() {
		return super.toString();
	}*/
}

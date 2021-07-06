package bytebank;

public class ControleBonificacao {
	//Atritubos
	private double soma;
	
	public void registra(Funcionario funcionario) {
		System.out.println("Registrando bonificação de " + funcionario.getNome());
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return this.soma;
	}
}

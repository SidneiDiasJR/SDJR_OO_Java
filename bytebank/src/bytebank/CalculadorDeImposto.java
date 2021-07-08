package bytebank;

public class CalculadorDeImposto {
	//Atributos
	private double totalImposto;
	
	//M�todos
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}
	public double getTotalImposto() {
		return this.totalImposto;
	}
}

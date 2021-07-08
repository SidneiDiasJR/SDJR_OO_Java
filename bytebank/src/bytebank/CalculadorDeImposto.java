package bytebank;

public class CalculadorDeImposto {
	//Atributos
	private double totalImposto;
	
	//Métodos
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}
	public double getTotalImposto() {
		return this.totalImposto;
	}
}

package bytebank;

public class AutenticacaoUtil{
	//Atributos
	private int senha;
	
	//M�todos Implementados
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
}

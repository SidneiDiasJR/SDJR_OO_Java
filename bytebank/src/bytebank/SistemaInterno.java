package bytebank;

public class SistemaInterno {
	//Atributos
	private int senha = 2222;
	
	//M�todos
	public void autentica (Autenticavel autenticavel) {
		boolean autenticou = autenticavel.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema.");
		} else {
			System.out.println("N�o pode entrar no sistema.");
		}
	}
}

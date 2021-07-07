package bytebank;

public class TesteSistema {
	public static void main(String[] args) {
		//Instâncias e variáveis
		Autenticavel administrador    = new Administrador("Bruce Wayne", "000.000.000-0", 100000, 2222);
		Autenticavel gerente          = new Gerente("Alfred Pennyworth", "111.111.111-1", 25000, 1111);
		Autenticavel cliente          = new Cliente("Jim Gordon", "101.101.101-1", 2222, "Comissário da Polícia");
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		//Teste de autenticação da classe SistemaInterno
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(cliente);
	}
}

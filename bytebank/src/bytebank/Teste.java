package bytebank;

public class Teste {
	public static void main(String[] args) {
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (Exception ex) {
			System.out.println("Erro de conexão!\nExceção: "+ex.getMessage());
		}
	}

}

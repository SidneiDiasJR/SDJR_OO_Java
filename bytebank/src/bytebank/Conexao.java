package bytebank;

public class Conexao implements AutoCloseable{
	public Conexao() {
		System.out.println("Abrindo Conex�o");
	}
	public void leDados(){
		System.out.println("Recebendo dados");
		throw new ConexaoException("Dados Corrompidos!");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Fechando conex�o");
	}
	
}

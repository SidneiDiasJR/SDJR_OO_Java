public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(ArithmeticException | NullPointerException | TesteException | Teste2Exception ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception "+msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws Teste2Exception{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws Teste2Exception {
        System.out.println("Ini do metodo2");
        //metodo2();
        //throw new TesteException("Deu Muito Ruim");
        throw new Teste2Exception("Deu Muito Ruim Mesmo");
        //System.out.println("Fim do metodo2");        
    }
}
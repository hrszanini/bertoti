package antipattern;

public abstract class Pagamento {
	
	public void pagar() {
		System.out.println("Pago");
	}
	
	public void gerar() {
		System.out.println("Gerado");
	}
}

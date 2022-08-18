package antipattern;

public class Boleto extends Pagamento {
	
	@Override
	public void pagar() {
		System.out.println("Não Pago");
	}
}

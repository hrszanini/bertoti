package antipattern;

public class PayPal extends Pagamento{
	
	@Override
	public void gerar() {
		System.out.println("Não gerado");
	}
}

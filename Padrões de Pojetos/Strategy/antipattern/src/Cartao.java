package antipattern;

public class Cartao extends Pagamento {
	
	@Override
	public void gerar() {
		System.out.println("Não gerado");
	}
}

import antipattern.*;
import pattern.*;

public class Teste {

	public static void main(String[] args) {
		antiPattern();
		pattern();
	}
	
	public static void antiPattern() {
		System.out.println("--Anti Pattern--");
		
		System.out.println("Cartão:");
		Cartao cartao = new Cartao();
		cartao.gerar();
		cartao.pagar();
		
		System.out.println("Boleto:");
		Boleto boleto = new Boleto();
		boleto.gerar();
		boleto.pagar();
	}
	
	public static void pattern() {
		System.out.println("--Pattern--");
		PagamentoPattern pagamento = new PagamentoPattern();
		
		System.out.println("Cartão:");
		pagamento.setFormaPagamento(definirVirtual("Cartão"));
		pagamento.setFormaGeracao(definirFisico("Cartão"));
		pagamento.realizarPagamento();
		pagamento.realizarGeracao();
		
		System.out.println("Boleto:");
		pagamento.setFormaPagamento(definirVirtual("Boleto"));
		pagamento.setFormaGeracao(definirFisico("Boleto"));
		pagamento.realizarPagamento();
		pagamento.realizarGeracao();
	}
	
	public static FormaPagamento definirVirtual(String tipo) {
		if(tipo.equals("Cartão") || tipo.equals("PayPal")) {
			return new Virtual();
		} else {
			return new NaoVirtual();
		}
	}
	
	public static FormaGeracao definirFisico(String tipo) {
		if(tipo.equals("Boleto")) {
			return new Fisico();
		} else {
			return new NaoFisico();
		}
	}	
}

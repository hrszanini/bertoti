package pattern;

public class PagamentoPattern {
	private FormaPagamento formaPagamento;
	private FormaGeracao formaGeracao;
	
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public void setFormaGeracao(FormaGeracao formaGeracao) {
		this.formaGeracao = formaGeracao;
	}
	
	public void realizarPagamento() {
		formaPagamento.pagar();
	}
	
	public void realizarGeracao() {
		formaGeracao.gerar();
	}
}

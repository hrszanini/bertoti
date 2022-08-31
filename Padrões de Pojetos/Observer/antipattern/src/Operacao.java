
public class Operacao {
	private String tipo;
	private boolean concluido;
	
	private Log log;
	private Email email;
	
	public Operacao(Log log, Email email) {
		this.log = log; 
		this.email = email;
	}
	
	public void setOperacao(String tipo, boolean concluido) {
		this.tipo = tipo;
		this.concluido = concluido;
		
		log.logar(this);
		email.enviarEmail(this);
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public boolean isConcluido() {
		return concluido;
	}
}

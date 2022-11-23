
public class Email implements Subscriber{
	public void enviarEmail(Operacao operacao) {
		System.out.println("Email enviado da operação: " + operacao.getTipo());
	}

	public void update(Operacao operacao) {
		enviarEmail(operacao);	
	}
}

package pattern;

public class Email {
	public void enviarEmail(Operacao operacao) {
		System.out.println("Email enviado da operação: " + operacao.getTipo());
	}
}

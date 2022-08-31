package pattern;

public class Log implements Subscriber{
	public void logar(Operacao operacao) {
		String message = "Opera��o: " + operacao.getTipo();
		if(operacao.isConcluido())
			message += " [Conclu�da]";
		
		System.out.println(message);
	}

	public void update(Operacao operacao) {
		logar(operacao);
	}
}

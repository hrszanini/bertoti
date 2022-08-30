package pattern;

public class Log implements Subscriber{
	public void logar(Operacao operacao) {
		String message = "Operação: " + operacao.getTipo();
		if(operacao.isConcluido())
			message += " [Concluída]";
		
		System.out.println(message);
	}

	public void update(Operacao operacao) {
		logar(operacao);
	}
}

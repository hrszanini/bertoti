package antipattern;

public class Log implements Observer{
	public void logar(Operacao operacao) {
		String message = "Opera��o: " + operacao.getTipo();
		if(operacao.isConcluido())
			message += " [Conclu�da]";
		
		System.out.println(message);
	}
}

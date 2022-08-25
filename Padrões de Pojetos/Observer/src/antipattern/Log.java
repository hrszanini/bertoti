package antipattern;

public class Log implements Observer{
	public void logar(Operacao operacao) {
		String message = "Operação: " + operacao.getTipo();
		if(operacao.isConcluido())
			message += " [Concluída]";
		
		System.out.println(message);
	}
}

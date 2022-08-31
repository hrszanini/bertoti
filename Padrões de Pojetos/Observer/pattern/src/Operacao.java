
import java.util.ArrayList;

public class Operacao implements Publisher{
	private String tipo;
	private boolean concluido;
	
	private ArrayList<Subscriber> subscribers;

	
	public void setOperacao(String tipo, boolean concluido) {
		this.tipo = tipo;
		this.concluido = concluido;
		
		notifyObservers();
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public boolean isConcluido() {
		return concluido;
	}

	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void notifyObservers() {
		for(Subscriber subscriber : subscribers)
			subscriber.update(this);
	}
}

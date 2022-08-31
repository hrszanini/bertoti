
public interface Publisher {
	public void subscribe(Subscriber subscriber);
	public void notifyObservers();
}

package src.model;

import src.view.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void notifyObservers(Integer alunoRa, Integer turmaId);
}

package Observateur;

public interface Observable {
  void addObserver(Observateur o);
  void removeObserver(Observateur o);
  void notifyObservers();
}

package Vues;

import Observateur.Observable;
import Observateur.Observateur;

public class VueListAppartem implements Observateur {

  @Override
  public void update() {
    System.out.println("VueListAppartem::update()");
  }
}

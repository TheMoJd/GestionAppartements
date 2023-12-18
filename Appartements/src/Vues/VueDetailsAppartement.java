package Vues;
import Modele.Appartement;
import Observateur.Observateur;
public class VueDetailsAppartement implements Observateur {


  @Override
  public void update(){
    System.out.println("VueDetailsAppartement::update()");
  }
}

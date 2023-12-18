package Facade;

import Factory.*;
import Modele.Appartement;
import Modele.Chaudiere;
import Modele.Piece;
import Observateur.Observable;
import Observateur.Observateur;
import Visior.Visiteur;

import java.util.ArrayList;
import java.util.List;

public class Facade implements Observable {
  private Factory factory = new Factory();
  private List<Appartement> appartements = new ArrayList<Appartement>();
  private List<Observateur> observateurs = new ArrayList<Observateur>();
  private Appartement appartementSelectionne;


  public void creerAppartement(String adresse, Integer etage, String marque, String modele, String type, Integer surface, Integer nbRadiateur) {
    Appartement appartement = Factory.createAppartement(adresse, etage, marque, modele, type, surface, nbRadiateur);
    this.appartements.add(appartement);
  }

  public void supprimerAppartement(String adresse) {
    for (Appartement appartement : appartements) {
      if(appartement.getAdresse().equals(adresse)) {
        this.appartements.remove(appartement);
      }
    }
  }

  public void afficherAppartements(Visiteur visiteur) {
    for (Appartement appartement : appartements) {
      appartement.accept(visiteur);
    }
  }

  public void updateChaudiere(String adresse, String marque, String modele, String type) {
    for (Appartement appartement : appartements) {
      if(appartement.getAdresse().equals(adresse)) {
        Chaudiere chaudiere = Factory.createChaudiere(marque, modele, type);
        appartement.setChaudiere(chaudiere);
      }
    }
  }

  public void creerAppartements(String cheminFichier) {
    ListFactory listFactory = new ListFactory();
    List<Appartement> appartementsLus = listFactory.creerAppartements(cheminFichier);
    for (Appartement appartement : appartements) {
      if(!this.appartements.contains(appartement)) {
        this.appartements.add(appartement);
      }
    }
  }

  @Override
  public void addObserver(Observateur o) {
    observateurs.add(o);
  }

  @Override
  public void notifyObservers() {
    for (Observateur observateur : observateurs) {
      observateur.update();
    }
  }

  @Override
  public void removeObserver(Observateur o) {
    observateurs.remove(o);
  }

  public void setAppartementSelectionne(Appartement appartementSelectionne){
    this.appartementSelectionne = appartementSelectionne;
    notifyObservers();
  }

  public Appartement getAppartementSelectionne(){
    return this.appartementSelectionne;
  }
}

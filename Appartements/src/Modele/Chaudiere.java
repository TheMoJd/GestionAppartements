package Modele;

import Visior.*;

public class Chaudiere implements Visitable {
  private String marque;
  private String modele;
  private String type ;

  public Chaudiere(String marque, String modele, String type) {
    this.marque = marque;
    this.modele = modele;
    this.type = type;
  }

  public String getMarque() {
    return this.marque;
  }

  public String getModele() {
    return this.modele;
  }

  public String getType() {
    return this.type;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public void setModele(String modele) {
    this.modele = modele;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String toString() {
    return "Chaudiere [marque=" + this.marque + ", modele=" + this.modele + ", type=" + this.type + "]";
  }

  @Override
  public void accept(Visiteur visiteur){
    visiteur.visitChaudiere(this);
  }
}

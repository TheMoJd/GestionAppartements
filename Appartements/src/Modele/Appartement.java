package Modele;

import Visior.Visitable;
import Visior.Visiteur;

import java.util.List;

public class Appartement implements Visitable {
  private String adresse;
  private Integer etage;
  private Chaudiere chaudiere;

  private List<Piece> pieces;

  public Appartement(String adresse, Integer etage, Chaudiere chaudiere, List<Piece> pieces) {
    this.adresse = adresse;
    this.etage = etage;
    this.chaudiere = chaudiere;
    this.pieces = pieces;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public Integer getEtage() {
    return this.etage;
  }

  public Chaudiere getChaudiere() {
    return this.chaudiere;
  }

  public List<Piece> getPieces() {
    return this.pieces;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public void setEtage(Integer etage) {
    this.etage = etage;
  }

  public void setChaudiere(Chaudiere chaudiere) {
    this.chaudiere = chaudiere;
  }

  public void setPieces(List<Piece> pieces) {
    this.pieces = pieces;
  }

  public String toString() {
    return "Appartement [adresse=" + this.adresse + ", etage=" + this.etage + ", chaudiere=" + this.chaudiere + ", pieces=" + this.pieces + "]";
  }

  @Override
  public void accept(Visiteur visiteur) {
    visiteur.visitAppartements(this);
  }
}

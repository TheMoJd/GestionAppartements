package Modele;
import Visior.*;

public class Piece implements Visitable {
  private Integer surface;
  private Integer nbRadiateur;

  public Piece(Integer surface, Integer nbRadiateur) {
    this.surface = surface;
    this.nbRadiateur = nbRadiateur;
  }

  public Integer getSurface() {
    return this.surface;
  }

  public Integer getNbRadiateur() {
    return this.nbRadiateur;
  }

  public void setSurface(Integer surface) {
    this.surface = surface;
  }

  public void setNbRadiateur(Integer nbRadiateur) {
    this.nbRadiateur = nbRadiateur;
  }

  public String toString() {
    return "Piece [surface=" + this.surface + ", nbRadiateur=" + this.nbRadiateur + "]";
  }

  @Override
  public void accept(Visiteur visiteur){
    visiteur.visitPiece(this);
  }
}

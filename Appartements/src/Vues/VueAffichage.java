package Vues;

import Visior.*;
import Modele.*;

public class VueAffichage implements Visiteur {
  @Override
  public void visitChaudiere(Chaudiere chaudiere) {
    System.out.println("Chaudiere [marque=" + chaudiere.getMarque() + ", modele=" + chaudiere.getModele() + ", type=" + chaudiere.getType() + "]");
  }

  @Override
  public void visitPiece(Piece piece) {
    System.out.println("Piece [surface=" + piece.getSurface() + ", nbRadiateur=" + piece.getNbRadiateur() + "]");
  }
  @Override
  public void visitAppartements(Appartement appartement) {
    System.out.println("Appartement [adresse=" + appartement.getAdresse() + ", etage=" + appartement.getEtage() + ", chaudiere=" + appartement.getChaudiere() + ", pieces=" + appartement.getPieces() + "]");
  }


}

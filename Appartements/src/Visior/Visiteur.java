package Visior;

import Modele.Appartement;
import Modele.Chaudiere;
import Modele.Piece;

public interface Visiteur {
  public void visitAppartements(Appartement appartement);
  public void visitChaudiere(Chaudiere chaudiere);
  public void visitPiece(Piece piece);

}

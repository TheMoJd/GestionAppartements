package Factory;
import Modele.*;

import java.util.ArrayList;
import java.util.List;

public class Factory {
  private static Integer nbFactoryCree = 0;

  public static Appartement createAppartement(String adresse, Integer etage, String type, String marque, String modele, Integer surface, Integer nbRadiateur) {
    Piece piece1 = createPiece(surface, nbRadiateur);
    Piece piece2 = createPiece(surface, nbRadiateur);
    Chaudiere chaudiere = createChaudiere(marque, modele, type);
    List<Piece> pieces = new ArrayList<Piece>();
    pieces.add(piece1);
    pieces.add(piece2);
    nbFactoryCree++;
    return new Appartement(adresse, etage, chaudiere, pieces);
  }

  public static Piece createPiece(Integer surface, Integer nbRadiateur) {
    return new Modele.Piece(surface, nbRadiateur);
  }

  public static Chaudiere createChaudiere(String marque, String modele, String type) {
    return new Chaudiere(marque, modele, type);
  }
}

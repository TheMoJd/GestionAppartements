package Factory;

import Modele.Appartement;

import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;

public class ListFactory {

  public List<Appartement> creerAppartements(String cheminFichier) {
    List<Appartement> appartements = new ArrayList<Appartement>();
    ObjectMapper mapper = new ObjectMapper();
    try {
      appartements = mapper.readValue(new File(cheminFichier), new TypeReference<List<Appartement>>() {
      });
    } catch (Exception e) {
      System.out.println(e);
    }
    return appartements;
  }
}

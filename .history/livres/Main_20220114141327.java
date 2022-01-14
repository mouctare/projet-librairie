package livres;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
    // Créer une liste qui va stoker le nom de chaque chapitre de l'ouvrage
    List<String> chapitres = new ArrayList<>();
    chapitres.add("Chapitre 1. Qu'est-ce que le Java ?");
    chapitres.add("Chapitre 2. Qu'est-ce qu'une variable ?");
    chapitres.add("Chapitre 3. Les conditions");
    chapitres.add("Chapitre 4. Les tableaux");

    System.out.println("Sommaire: ");
    // affichage du sommaire

   /*  for(String chapitre : chapitres){
   System.out.println(chapitre);
    } */
    // Boucle avec les lamdas
    //chapitres.forEach(chapitre -> System.out.println(chapitre));
    chapitres.forEach(System.out::println);
}
    
}

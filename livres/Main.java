package livres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    // Créer une liste qui va stoker le nom de chaque chapitre de l'ouvrage
    List<String> chapitres = new ArrayList<>();
    chapitres.add("Chapitre 1. Qu'est-ce que le Java ?");
    chapitres.add("Chapitre 2. Qu'est-ce qu'une variable ?");
    chapitres.add("Chapitre 3. Les conditions");
    chapitres.add("Chapitre 4. Les tableaux");

    System.out.println("Sommaire: ");
   
    
  //  chapitres.forEach(System.out::println);

    // chapitre 1
    List<String> chapitre1 = new ArrayList<>();
    chapitre1.add("Bienvenu sur le premier chapitre");
    chapitre1.add("Bienvenu sur le premier chapitre");
    chapitre1.add("Bienvenu sur le premier chapitre");

    // chapitre 2
    List<String> chapitre2 = new ArrayList<>();
    chapitre2.add("Bienvenu sur le premier chapitre");
    chapitre2.add("Bienvenu sur le premier chapitre");
    chapitre2.add("Bienvenu sur le premier chapitre");

    Livre livre = new Livre("Les Bases de la programmation");
    livre.addPage(chapitre1);
    livre.addPage(chapitre2);
    System.out.println(livre.getName() + " nombre de pages" +  " " + livre.getNumberPages());

    // proposer à l'utilisateur d'entrer un numero de page
    Scanner scan = new Scanner(System.in);
    int choixPage = scan.nextInt();
    System.out.println("Page à lire: " + choixPage);

    // verification de la page sélectionner
    if(livre.getNumberPages() >= choixPage && choixPage > 0){
      List<String> lignes =  livre.getPage(choixPage - 1);
      lignes.forEach(ligne -> System.out.println(ligne));
    }
}
    
}

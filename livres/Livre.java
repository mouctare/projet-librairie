package livres;

import java.util.ArrayList;
import java.util.List;

class Livre{
   // private int numberPages;
    private String name;
   // Liste de pages
   List<Page> pages;

    public Livre(String name){
       this.name = name;
       this.pages = new ArrayList<>();
    }

    public void addPage(List<String> lignes){
        // créer la page
      //  Page nouvellePage = new Page(lignes);
        pages.add(new Page(lignes));
    }

// trouver une ligne
  public List<String> getPage(int numroPage){
       return pages.get(numroPage).getLignes();
  }

 public int  getNumberPages(){
     return this.pages.size();
 }
 public String getName(){
     return name;
 }
}
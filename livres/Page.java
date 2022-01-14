package livres;

import java.util.List;

class Page{
    // Une page est composée de plusieurs lignes
    
    private List<String> lignes;

    public Page(List<String> lignes){
        this.lignes = lignes;
    }

    public List<String> getLignes(){
        return lignes;
    }
}
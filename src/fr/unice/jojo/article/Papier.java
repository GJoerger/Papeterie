package fr.unice.jojo.article;

/**
 * 
 */

/**
 * @author Gregory
 *
 */
public class Papier extends Article{
    private String grammage;
 
    public Papier(String ref,String nom, String marque,double price, String grammage){
        this.ref = ref;
        this.nom = nom;
        this.grammage = grammage;
        this.marque = marque;
        this.price = price;
        
    }

    /**
     * @return the grammage
     */
    public String getGrammage() {
        return grammage;
    }

    /**
     * @param grammage the grammage to set
     */
    public void setGrammage(String grammage) {
        this.grammage = grammage;
    }
    
    
}

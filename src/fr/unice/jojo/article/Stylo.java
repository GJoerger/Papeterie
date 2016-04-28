package fr.unice.jojo.article;

/**
 * 
 */

/**
 * @author Gregory
 *
 */
public class Stylo extends Article{
    private String couleur;
    
    public Stylo(String ref, String nom, String marque, double price, String couleur){
        this.ref = ref;
        this.nom = nom;
        this.couleur = couleur;
        this.marque = marque;
        this.price = price;
        
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    
}

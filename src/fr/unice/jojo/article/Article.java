package fr.unice.jojo.article;
/**
 * 
 */

/**
 * @author Gregory
 *
 */
public class Article {
    protected String ref;
    protected String nom;
    protected String marque;
    protected double price;
    
    public Article(){
        
    }
    /**
     * @return the ref
     */
    public String getRef() {
        return ref;
    }
    /**
     * @param ref the ref to set
     */
    public void setRef(String ref) {
        this.ref = ref;
    }
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }
    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

}

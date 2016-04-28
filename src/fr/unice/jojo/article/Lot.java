package fr.unice.jojo.article;

/**
 * 
 */

/**
 * @author Gregory
 *
 */
public class Lot {
    private String nom;
    private int nbarticle;
    private float reduction;
    private Article articletype;
    private double price;
    
    public Lot(Article article, int nbarticle, float reduction){
        this.articletype = article;
        this.nbarticle = nbarticle;
        this.reduction = reduction;
        this.price = (double)this.nbarticle * this.articletype.getPrice() * this.reduction; 
        this.nom = "Lot de "+ this.nbarticle +" "+ this.articletype.getNom();
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
     * @return the nbarticle
     */
    public int getNbarticle() {
        return nbarticle;
    }
    /**
     * @param nbarticle the nbarticle to set
     */
    public void setNbarticle(int nbarticle) {
        this.nbarticle = nbarticle;
    }
    /**
     * @return the reduction
     */
    public float getReduction() {
        return reduction;
    }
    /**
     * @param reduction the reduction to set
     */
    public void setReduction(float reduction) {
        this.reduction = reduction;
    }
    /**
     * @return the articletype
     */
    public Article getArticletype() {
        return articletype;
    }
    /**
     * @param articletype the articletype to set
     */
    public void setArticletype(Article articletype) {
        this.articletype = articletype;
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
    public void setPrice() {
        this.price = (double)this.nbarticle * this.articletype.getPrice() * this.reduction;
    }
    
    
    
}

/**
 * 
 */
package fr.unice.jojo.employe;

/**
 * @author Gregory
 *
 */
public class Coreemploye {
    protected String prenom;
    protected String nom;
    protected final double heuremax = 39;
    protected String entreprise;

    public Coreemploye(String nom, String prenom,String ent){
        this.nom = nom;
        this.prenom = prenom;
        this.entreprise = ent;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
     * @return the heuremax
     */
    public double getHeuremax() {
        return heuremax;
    }
    
    public double getSalaire(){
        return 0;
    }
}

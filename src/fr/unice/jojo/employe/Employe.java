/**
 * 
 */
package fr.unice.jojo.employe;

/**
 * @author Gregory
 *
 */
public class Employe extends Coreemploye {
    protected double tauxhoraire;
    protected double horairehebdo;
    
    
    public Employe(String nom, String prenom,String ent, double th, double hh){
        super(nom, prenom, ent);
        this.tauxhoraire = th;
        this.horairehebdo = hh;
    }
    
    public void setInfoSalaire(double th, double hh){
        this.tauxhoraire = th;
        this.horairehebdo = hh;
    }
}

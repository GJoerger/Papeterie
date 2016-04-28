/**
 * 
 */
package fr.unice.jojo.employe;

/**
 * @author Gregory
 *
 */
public class Commercial extends Coreemploye{
    private double salaire;
    private double ca;
    private final double RCA = 0.01D;
    
    public Commercial(String nom, String prenom, String ent, double salaire, double ca){
        super(nom,prenom, ent);
        this.salaire = salaire;
        this.ca = ca;
    }
    
    public void setInfoSalaire(double salaire, double ca){
        this.salaire = salaire;
        this.ca = ca;
    }
    
    public double getSalaire(){
        double tempsalaire;
        tempsalaire = salaire + this.ca * RCA;
        return tempsalaire;
    }
}

/**
 * 
 */
package fr.unice.jojo.employe;

/**
 * @author Gregory
 *
 */
public class Salarie extends Employe {
    private double theuresup;
    protected double nbheuresup;
    
    public Salarie(String nom, String prenom, String ent, double th, double hh, double nbhsup, double theuresup){
        super(nom, prenom, ent,th, hh);
        this.theuresup = theuresup;
        this.nbheuresup = nbhsup;
    }
    
    public void setInfoSalaire(double th, double hh, double nhs,double ths){
        super.setInfoSalaire(th,hh);
        this.theuresup = ths;
    }
    
    public double getSalaire(){
        double tempsalaire;
        tempsalaire = this.theuresup* this.tauxhoraire * this.nbheuresup + this.tauxhoraire * this.horairehebdo;
        return tempsalaire;
    }
}

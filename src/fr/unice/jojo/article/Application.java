package fr.unice.jojo.article;
import fr.unice.jojo.facture.*;

import java.util.Iterator;

import fr.unice.jojo.employe.*;
import fr.unice.jojo.entreprise.Entreprise;
/**
 * @author Gregory
 *
 */
public class Application {

     //private Coreemploye e[];
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //Coreemploye c1= new Coreemploye();
        
        
        Coreemploye c1=new Commercial("Convenant", "Jean Claude","CAF", 1000.00D, 150000.00D);
        Coreemploye c2=new Salarie("Patulacci", "Marcel","CAF", 15.00, 39.00, 2, 1.30D);
        Coreemploye c3=new Salarie("Larson", "Nicky","CAF", 20.00, 39.00,4,1.50D);
        Coreemploye c4=new Commercial("Bétix", "Ordralfa","CAF", 600.00D, 50000.00D);
        Coreemploye c5=new Commercial("Matix", "Cétauto","CAF", 600.00D, 30000.00D);
        Coreemploye c6=new Salarie("L'asticot", "Jojo","CAF", 12.00,39.00,0,1.30D); 
        
        Coreemploye c7=new Salarie("Granger", "Hermione","Poudlard", 12.00,39.00,0,1.30D);
        Coreemploye c8=new Salarie("Potter", "Harry","Poudlard", 12.00,39.00,0,1.30D);
        Coreemploye c9=new Salarie("Weasley", "Ron","Poudlard", 12.00,39.00,0,1.30D);
        
        Entreprise e = new Entreprise("CAF");
        Entreprise f = new Entreprise("Poudlard");
        e.addEmploye(c1);
        e.addEmploye(c2);
        e.addEmploye(c3);
        e.addEmploye(c4);
        e.addEmploye(c5);
        e.addEmploye(c6);
        
        f.addEmploye(c7);
        f.addEmploye(c8);
        f.addEmploye(c9);
        
        double salaire_e1 = 0.00D;
        double salaire_e2 = 0.00D;
        Iterator<Coreemploye> iterator = e.iterEmploye();
        while(iterator.hasNext())
        {
           Coreemploye c = iterator.next();
            
            if(c instanceof Salarie){
                //salaire_e1 += iterator.next().getSalaire();
                salaire_e1 += c.getSalaire();
                System.out.println("Salaire total : " +salaire_e1);
            }
            
            if(c instanceof Commercial){
                salaire_e1 += c.getSalaire();
                System.out.println("Salaire total : " +salaire_e1);
            }
        }
        System.out.println("Salaire total : " +salaire_e1);
        
        
        
        Iterator<Coreemploye> iterator2 = f.iterEmploye();
        
        //e.afficher2();
        //f.afficher2();
        
        
        
        
        //for (int i = 0; i < e.length; i++) {
            //System.out.println(e[i].getNom()+" "+ e[i].getPrenom() +" gagne "+e[i].getSalaire() );
        //}
        //Stylo s1 = new Stylo("1", "Stylo Cristal", "Bic", 2.00D, "Vert");
        //Lot l1 = new Lot(s1,100,0.80f);
        /*
        //init
        Facture f1 = new Facture("1",(long)123456,"Jeanmimi", 25,2);
        Facture f2 = new Facture("2", (long)1234567,"Ginette", 5,0);
        
        Stylo s1 = new Stylo("1", "Cristal", "Bic", 50.00D, "Bleu");
        Stylo s2 = new Stylo("2", "Verre", "Bic", 90.00D, "Vert");
        
        Papier p1 = new Papier("3", "Papier Dessin", "Canson", 9.50D, "0.8");
        
        Lot l1 = new Lot(s2, 5, 1.00f);
        
        f1.remplirArtList(s1, 10);
        f1.remplirArtList(p1, 15);
        f1.remplirLotList(l1, 2);
        
        f2.remplirArtList(s1, 3);
        f2.remplirArtList(p1, 2);
        
        f1.calcMontant();
        f2.calcMontant();
        
        System.out.println("Facture f1 prix : "+f1.getTotprice());
        System.out.println("Facture f2 prix : "+f2.getTotprice());
        //Remplissage*/
        
        
        /*
        System.out.println("Objet : " +l1.getNom());
        System.out.println("Lot de : " +l1.getNom());
        System.out.println("Nb articles : " +l1.getNbarticle());
        System.out.println("Reduction : " +l1.getReduction());
        System.out.println("Prix : " +String.format("%.2f",l1.getPrice()));
        */
    }
}

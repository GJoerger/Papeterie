package fr.unice.jojo.entreprise;
import java.util.ArrayList;
import java.util.Iterator;
import fr.unice.jojo.article.*;

import fr.unice.jojo.employe.*;

public class Entreprise {

        private String noment;
        private ArrayList<Coreemploye> employe;
        
        public Entreprise(String nom){
            this.noment = nom;
            this.employe = new ArrayList<Coreemploye>();
        }
        
        public void addEmploye(Coreemploye e){
            employe.add(e);            
        }
        
        public void removeEmploye(Coreemploye e){
            employe.remove(e);
        }
        
        public void afficher(){
            System.out.println("Entreprise : " +noment);
            
            Iterator<Coreemploye> iterator = employe.iterator();
            while(iterator.hasNext())
            {
                Coreemploye c = iterator.next();
                
                if(c instanceof Salarie)
                    System.out.println("Nom : "+c.getNom());
                
                if(c instanceof Commercial)
                    System.out.println("Nom : "+c.getNom());
            }
        }
        
        public void afficher2(){
            System.out.println("Entreprise : " +noment);
            for(Coreemploye elem: this.employe){
                if(elem instanceof Salarie)
                    System.out.println("Nom : "+elem.getNom()+" "+elem.getSalaire());
                
                if(elem instanceof Commercial)
                    System.out.println("Nom : "+elem.getNom()+ " "+ elem.getSalaire());
            }
        }
        
        public Iterator<Coreemploye> iterEmploye(){
            Iterator<Coreemploye> iterator = employe.iterator();
            return iterator;
        }
}

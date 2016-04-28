/**
 * 
 */
package fr.unice.jojo.facture;
import fr.unice.jojo.article.*;
/**
 * @author Gregory
 *
 */
public class Facture {
    private String ref;
    private long date;
    private String clientname;
    private double totprice;
    private Article artlist[];
    private Lot lotlist[];
    /**
     * @return the ref
     */
    public Facture(String ref, long date, String clientname,int nbart, int nblot){
        this.ref = ref;
        this.date = date;
        this.clientname = clientname;
        this.artlist = new Article[nbart];
        this.lotlist = new Lot[nblot];
    }
    
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
     * @return the date
     */
    public long getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(long date) {
        this.date = date;
    }
    /**
     * @return the clientname
     */
    public String getClientname() {
        return clientname;
    }
    /**
     * @param clientname the clientname to set
     */
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
    /**
     * @return the totprice
     */
    public double getTotprice() {
        return totprice;
    }
    /**
     * @param totprice the totprice to set
     */
    public void setTotprice(double totprice) {
    }
    
    public void calcMontant(){
        for (int i = 0; i < this.artlist.length; i++) {
            this.totprice += this.artlist[i].getPrice();
        }
        
        for (int i = 0; i < this.lotlist.length; i++) {
            this.totprice += this.lotlist[i].getPrice();
        }
    }
    /**
     * @return the artlist
     */
    public Article[] getArtlist() {
        return artlist;
    }
    /**
     * @param artlist the artlist to set
     */
    public void setArtlist(Article[] artlist) {
        this.artlist = artlist;
    }

    /**
     * @return the lotlist
     */
    public Lot[] getLotlist() {
        return lotlist;
    }

    /**
     * @param lotlist the lotlist to set
     */
    public void setLotlist(Lot[] lotlist) {
        this.lotlist = lotlist;
    }
    
    public void remplirArtList(Article art, int nb){
        int slotlibre = 0;
        
        //récupération de l'index du tableau null
        for(int i=0; i<artlist.length; i++){
            if (this.artlist[i] == null){
                slotlibre = i;
                i = artlist.length;
            }
        }
        nb += slotlibre;
        
        for (int i = slotlibre; i < nb; i++) {
            this.artlist[i] = art;
        }
    }
    
    public void remplirLotList(Lot l, int nb){
        int slotlibre = 0;
        
        //récupération de l'index du tableau null
        for(int i=0; i<lotlist.length; i++){
            if (this.lotlist[i] == null){
                slotlibre = i;
                i = lotlist.length;
            }
        }
        
        nb+=slotlibre;
        
        for (int i = slotlibre; i < nb; i++) {
            this.lotlist[i] = l;
        }
    }
    
}


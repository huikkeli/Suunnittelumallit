/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;


/**
 *
 * @author Huy Nguyen
 */
public class Tietokone {
    
   private final AbstractFactory factory;
   private Komponentti rakenna;
   private Komponentti emolevy;
   private Komponentti prosessori;
   private Komponentti n�yt�nohjain;
   private Komponentti muistipiiri;
   private Komponentti verkkokortti;
  
   public Tietokone(AbstractFactory factory) {
        this.factory = factory;
        assemble();
    }
    
    private void assemble() {
        rakenna = factory.createKotelo();
        emolevy = factory.createEmolevy();
        prosessori = factory.createProsessori();
        n�yt�nohjain = factory.createN�yt�nohjain();
        muistipiiri = factory.createMuistipiiri();
        verkkokortti = factory.createVerkkokortti();
        
        emolevy.add(prosessori);
        emolevy.add(n�yt�nohjain);
        emolevy.add(muistipiiri);
        emolevy.add(verkkokortti);
        rakenna.add(emolevy);
    }
    
    public double getPrice() {
        return rakenna.getPrice();
    }

   
    
}   

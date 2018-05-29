/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Huy Nguyen
 */
public class Jasper {
    
    private AbstractFactory factory;
    private Lippis lippis;
    private Paita paita;
    private Housut housut;
    private Keng�t keng�t;
    
    public Jasper() { }

    public Jasper(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public Lippis getLippis() {
        return lippis;
    }

    public void setLippis(Lippis lippis) {
        this.lippis = lippis;
    }
    
    public Paita getPaita() {
        return paita;
    }

    public void setPaita(Paita paita) {
        this.paita = paita;
    }
    
    public Housut getHousut() {
        return housut;
    }

    public void setHousut(Housut housut) {
        this.housut = housut;
    }

    public Keng�t getKeng�t() {
        return keng�t;
    }

    public void setKeng�t(Keng�t keng�t) {
        this.keng�t = keng�t;
    }
    
    public void getPukee() {
        lippis = factory.createLippis();
        paita = (Paita) factory.createPaita();
        housut = (Housut) factory.createHousut();
        keng�t = factory.createKeng�t();
    }
    
    public String vaatteet() {
        return lippis.toString() + ", " + paita.toString() + ", " + housut.toString() + " ja " + keng�t.toString() + ".";
    }
}

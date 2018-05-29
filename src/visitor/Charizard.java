/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Huy Nguyen
 */
public class Charizard implements State {
    
    private static final Charizard instance = new Charizard();
    
    public static State getInstance() {
        return instance;
    }
    @Override
    public void kehitysaste(final Context pokemon) {
    }
    
    @Override
    public void hy�kk��(){
        System.out.println("Liekinheitin");
    }
    
    @Override
    public void liiku(){
        System.out.println("Lent��");
    }
    
    @Override
    public void puhu(){
        System.out.println("Charizard!");
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(instance);
    }
    
}



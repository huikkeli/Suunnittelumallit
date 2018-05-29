/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpizza;

/**
 *
 * @author Huy Nguyen
 */
public class Kinkku extends T‰ytteet {
    
    private double hinta;
    
    public Kinkku(Pizza Lis‰‰T‰yte){
        super(Lis‰‰T‰yte);
        hinta = 2.00;
    }
    
    @Override
    public double getHinta(){
        return super.getHinta() + hinta;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " kinkku"; 
    }
}

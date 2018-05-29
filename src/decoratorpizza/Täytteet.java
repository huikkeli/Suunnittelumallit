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
public abstract class T‰ytteet implements Pizza {
    
    protected Pizza Lis‰‰T‰yte;
    
    public T‰ytteet(Pizza Lis‰‰T‰yte){
        this.Lis‰‰T‰yte=Lis‰‰T‰yte;
    }
    
    public double getHinta(){
        return Lis‰‰T‰yte.getHinta();
    }
    
    public String getDescription() {
        return Lis‰‰T‰yte.getDescription();
    }
}

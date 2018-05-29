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
public class PomonFactory implements AbstractFactory{
    
    @Override
    public Lippis createLippis() {
        return new PomonLippis();
    }

    @Override
    public Paita createPaita() {
        return new PomonPaita();
    }

    @Override
    public Housut createHousut() {
        return new PomonHousut();
    }

    @Override
    public Kengät createKengät() {
        return new PomonKengät();
    }
    
}

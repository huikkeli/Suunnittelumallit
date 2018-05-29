/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *ddd
 * @author Huy Nguyen
 */
public class AdidasFactory implements AbstractFactory{
    
    @Override
    public Lippis createLippis() {
        return new AdidasLippis();
    }

    @Override
    public Paita createPaita() {
        return new AdidasPaita();
    }

    @Override
    public Housut createHousut() {
        return new AdidasHousut();
    }

    @Override
    public Keng�t createKeng�t() {
        return new AdidasKeng�t();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Huy Nguyen
 */
public class Esimies extends Handler {
    
    @Override
    protected String getKäsittelijä() {
        return "lähiesimies";
    }
    
    @Override
    protected double getHyväksyntä() {
        return BASE * 0.02;
    }
}

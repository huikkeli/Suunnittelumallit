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
public class P��likk� extends Handler {
    
    @Override
    protected String getK�sittelij�() {
        return "Yksink�n p��lik�lle";
    }
    
    @Override
    protected double getHyv�ksynt�() {
        return BASE * 0.05;
    }
}


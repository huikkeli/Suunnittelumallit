/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Huy Nguyen
 */
public class Hesburger extends HamppariBuilder<List> {
    
     public Hesburger() {
        burgerStructure = new ArrayList();
    }
    
    @Override
    public void buildS�mpyl�() {
        S�mpyl� s�mpyl� = new S�mpyl�("Iso S�mpyl� ");
        burgerStructure.add(s�mpyl�);
        hamppari.setS�mpyl�(s�mpyl�.getS�mpyl�());
    }

    @Override
    public void buildPihvi() {
        Pihvi pihvi = new Pihvi("kanapihvi ");
        burgerStructure.add(pihvi);
        hamppari.setPihvi(pihvi.getPihvi());
    }

    @Override
    public void buildMuu() {
        Muu muu = new Muu("maustekurkku salaatti ");
        burgerStructure.add(muu);
        hamppari.setMuu(muu.getMuu());
    }

    @Override
    public void buildKastike() {
        Kastike kastike = new Kastike("kurkkumajoneesi");
        burgerStructure.add(kastike);
        hamppari.setKastike(kastike.getKastike());
    }
}

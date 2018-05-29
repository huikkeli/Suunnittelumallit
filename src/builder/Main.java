/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy Nguyen
 */
public class Main {
    
    public static void main(String[] args) {
        HamppariBuilder mcdonalds = new McDonalds();
        HamppariBuilder hesburger = new Hesburger();
        Director director = new Director();
        
        director.setBurgerBuilder(hesburger);
        director.constructBurger();
        Hamppari hese = director.getHampurilainen();
        List heseStructure = (ArrayList) hesburger.getBurger();
        
        System.out.println("Kanahampurilainen");
        System.out.println(hese.toString());
        System.out.println(heseStructure.toString());
        
        director.setBurgerBuilder(mcdonalds);
        director.constructBurger();
        Hamppari m�kk�ri = director.getHampurilainen();
        StringBuilder m�kk�riStructure = (StringBuilder) mcdonalds.getBurger();
        
        System.out.println("Big Mac");
        System.out.println(m�kk�ri.toString());
        System.out.println(m�kk�riStructure.toString());
        
        
    }
}

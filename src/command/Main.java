/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Huy Nguyen
 */
public class Main {
    public static void main(String[] args) {
    
    Valkokangas kangas = new Valkokangas();
    Command yl�s = new Yl�sCommand(kangas);
    Command alas = new AlasCommand(kangas);
    Sein�painike button1 = new Sein�painike(yl�s);
    Sein�painike button2 = new Sein�painike(alas);
    button1.push();
    button2.push();
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Huy Nguyen
 */
public interface Visitor {
  
    public void visit(Charmander instance);
    public void visit(Charmeleon instance);
    public void visit(Charizard instance);
}

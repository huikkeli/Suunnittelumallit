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
public class Seinšpainike {
    
    Command cmd;
    
    public Seinšpainike(Command cmd){
        this.cmd = cmd;
    }
    public void push() {
        cmd.execute();
    }   
}

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
public class Yl�sCommand implements Command {
    
    private Valkokangas kangas;
    
    public Yl�sCommand(Valkokangas kangas){
        this.kangas = kangas;
    }
    
    @Override
    public void execute() {
	kangas.yl�s();
    }   
}

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
public class Context {
    
    private State state;
    
    public Context() {
	setState(Charmander.getInstance());
    }
    
    void setState(final State newState) {
	state = newState;
    }
	
    public void kehitysaste() {
	state.kehitysaste(this);
    }
	
    public void hy�kk��() {
        state.hy�kk��();
    }
    
    public void liiku() {
        state.liiku();
    }
    
    public void puhu() {
        state.puhu();
    }
    
    public void accept(Visitor visitor) {
        state.accept(visitor);
    }
}


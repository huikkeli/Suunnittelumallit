/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Huy Nguyen
 */

public interface State {
    
    public void hy�kk��();
    public void liiku();
    public void puhu();
    public void kehitysaste(final Context pokemon);
    public void accept(Visitor visitor);
}

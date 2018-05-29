/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Huy Nguyen
 */
public class PlugTypeC implements SocketTypeC{
    
    private AdapterCtoG adapter;
	
    @Override
    public void addToC(String plug) {
	System.out.println(plug + " connected to C socket.");
    }
	
    public void addCtoG(String plug){
        adapter = new AdapterCtoG();
	adapter.addToC(plug);
    }
}

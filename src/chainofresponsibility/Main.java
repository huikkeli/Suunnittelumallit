/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.util.Scanner;

/**
 *
 * @author Huy Nguyen
 */
public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double prosentti = 0.0;
        Esimies esimies = new Esimies();
        P��likk� p��likk� = new P��likk�();
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
        
        esimies.setSuccessor(p��likk�);
        p��likk�.setSuccessor(toimitusjohtaja);
        
        while(prosentti >= 0.0) {
            System.out.print("Anna ty�ntekij�n palkakankorotus prosentteina ");
            prosentti = scanner.nextDouble();
            esimies.processRequest(new Palkankorotus(prosentti));
        }  
    }   
}


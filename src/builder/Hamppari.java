/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Huy Nguyen
 */
public class Hamppari {
    
    private String s�mpyl�;
    private String pihvi;
    private String muu;
    private String kastike;

    public void setS�mpyl�(String S�mpyl�) {
        this.s�mpyl� = S�mpyl�;
    }

    public void setPihvi(String pihvi) {
        this.pihvi = pihvi;
    }

    public void setMuu(String muu) {
        this.muu = muu;
    }

    public void setKastike(String kastike) {
        this.kastike = kastike;
    }
    
    @Override
    public String toString() {
        return s�mpyl� + ", " + pihvi + ", " +  muu + "ja " + kastike + ".";
    }
}

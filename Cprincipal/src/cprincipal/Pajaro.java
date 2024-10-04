/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cprincipal;

/**
 *
 * @author ricardo
 */
public class Pajaro extends Animal{
    
    //Declaraciond de variables
    private String alas;
    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }
    
   
    
    
    
    public void HacerSonido(){
        System.out.println("kuh kuh...");
    }
}

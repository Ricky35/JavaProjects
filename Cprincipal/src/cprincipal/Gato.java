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
public class Gato extends Animal{
    
    //Declaraciond de variables
    private String bigote;
    private String tipoPelaje;

    public String getBigote() {
        return bigote;
    }

    public void setBigote(String bigote) {
        this.bigote = bigote;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }
    
    
    
    public void HacerSonido(){
        System.out.println("Miauuuhh...");
    }
}

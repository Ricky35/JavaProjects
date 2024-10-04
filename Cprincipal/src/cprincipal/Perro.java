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
public class Perro extends Animal{
    
    //Declaraciond de variables
    private String tipoDientes;
    
    
    public String getTipoDientes() {
        return tipoDientes;
    }

    public void setTipoDientes(String tipoDientes) {
        this.tipoDientes = tipoDientes;
    }

    public Perro(String tipoDientes) {
        this.tipoDientes = tipoDientes;
    }
    
    public void TipoDientes(){
        if(tipoDientes == "Largos"){
        System.out.println("Debes cortar los dientes del peroo");
        }
        
    }
    
    public int CalcularEdad(int edad ){
        return edad * 7;
    }
    
    public void HacerSonido(){
        System.out.println("jauuu jauuu...");
    }
    
}

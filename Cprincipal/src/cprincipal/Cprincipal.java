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
public class Cprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro objPerro = new Perro("Largos");
        Gato objGato = new Gato();
        Pajaro objPajaro = new Pajaro();
        
        objPerro.TipoDientes();
        System.out.println("La edad del peroo es: "+objPerro.CalcularEdad(3));
        
    }
    
}

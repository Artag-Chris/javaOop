/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.clsEdad;

/**
 *
 * @author Christian Henao aguirre
 */
public class mainEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsEdad objEdad= new clsEdad("christian",Byte.parseByte(""+5));
        //objEdad.capturaDatos();
        objEdad.proceso();
    }
    
}

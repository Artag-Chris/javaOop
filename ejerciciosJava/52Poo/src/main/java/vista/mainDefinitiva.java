/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.clsNotas;

/**
 *
 * @author Christian Henao Aguirre
 */
public class mainDefinitiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsNotas objNotas = new clsNotas();
        objNotas.solicitudDatos();
        objNotas.calcularDefinitiva();
    }
    
}

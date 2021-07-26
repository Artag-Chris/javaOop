/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.clsEncuesta;

/**
 *
 * @author Christian Henao
 */
public class mainEncuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsEncuesta objEncuesta = new clsEncuesta("Christian");
        clsEncuesta objEncuesta1 = new clsEncuesta("pedro","rojas");
        clsEncuesta objEncuesta2 = new clsEncuesta("pablo","perez","calle Falsa 123");
    }
    
}

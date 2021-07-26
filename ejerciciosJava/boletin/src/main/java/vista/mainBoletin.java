/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.clsBoletin;

/**
 *
 * @author Christian henao
 */
public class mainBoletin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsBoletin objBoletin1=new clsBoletin();
        clsBoletin objBoletin3=new clsBoletin();
        objBoletin1.setIdentificacion("1088261298");
        objBoletin1.calcularDef(Byte.parseByte(""+50),Byte.parseByte(""+25) );
        System.out.println(objBoletin1.toString());
        objBoletin3.calcularDef(Byte.parseByte(""+50),Byte.parseByte(""+25),Byte.parseByte(""+50) );
        objBoletin3.setIdentificacion("142536");
        System.out.println(objBoletin3.toString());
        clsBoletin objBoletin4 = new clsBoletin();
        objBoletin4.setIdentificacion("172839");
        objBoletin4.calcularDef(Double.parseDouble(""+4.5),Double.parseDouble(""+3.5));
        System.out.println(objBoletin4.toString());
    }
    
}

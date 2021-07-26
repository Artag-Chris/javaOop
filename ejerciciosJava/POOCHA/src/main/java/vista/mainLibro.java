/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.clsLibro;

/**
 *
 * @author Christian Henao Aguirre
 * programa que compara dos libros "objetos" para ver quien tiene mas paginas
 */
public class mainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsLibro objLibro = new clsLibro();
        objLibro.setISBN(1234567890);
        objLibro.setTitulo("el Pobre programador de java");
        objLibro.setAutor("alejandro arango");
        objLibro.setNumeroDePaginas(250);
        System.out.println(objLibro.toString());
        clsLibro objLibro2 = new clsLibro();
        objLibro2.setISBN(234567890);
        objLibro2.setTitulo("el rico programador de Rust");
        objLibro2.setAutor("Pedro parques");
        objLibro2.setNumeroDePaginas(500);
        System.out.println(objLibro2.toString());
        //pregunta sobre que libro tiene mas paginas y muestra la diferencia 
    objLibro.comparar(objLibro.getNumeroDePaginas(), objLibro2.getNumeroDePaginas(),objLibro.getTitulo(), objLibro2.getTitulo());
    
    }
    
    
}

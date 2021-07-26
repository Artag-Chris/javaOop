/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Christian henao aguirre
 * ejercicio que solicita nombre, apellido y direccion usando constructor 
 */
public class clsEncuesta {
    //declaracion atributos 
    private String nombre;
    private String apellido;
    private String direccion;
    //constructor
    public clsEncuesta(){// se recomienda usar constructor vacio 
    };
    public clsEncuesta(String nombre){
    this.nombre=nombre;
        System.out.println("su respuesta es "+getNombre());
    };
    public clsEncuesta(String nombre, String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
        System.out.println("su respuesta es "+getNombre()+" "+getApellido());
    };
    public clsEncuesta(String nombre,String apellido, String direccion){
    this.nombre=nombre;
    this.apellido=apellido;
    this.direccion=direccion;
        System.out.println("su respuesta es "+getNombre()+" "+getApellido()+" "+ getDireccion());
    };
    
    //encapsulacion
    public String getNombre(){
    return nombre;};
    public void setNombre(String nombre){
    this.nombre=nombre;};
    public String getApellido(){
    return apellido;};
    public void setApellido(String apellido){
    this.apellido=apellido;};
    public String getDireccion(){
    return direccion;};
    public void setDireccion(String direccion){
    this.direccion=direccion;};
    
 }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Christian Henao Aguirre
 * creacion del objeto libro para control de datos
 */
public class clsLibro {
    //definicion de atributos
    private Integer ISBN=0; //es un codigo unico de libros, por lo general son 10 numeros 
    private String titulo ="";
    private String autor="";
    private int numeroDePaginas=0;
    //constructores
    public clsLibro(){
    
    };
    public clsLibro(Integer ISBN,String titulo,String autor,int numeroDePaginas){
    this.ISBN=ISBN;
    this.titulo=titulo;
    this.autor=autor;
    this.numeroDePaginas=numeroDePaginas;   
    }
    //encapsulamiento
    public Integer getISBN(){
    return ISBN;
    }
    public void setISBN(Integer ISBN){
    this.ISBN=ISBN;
    }
    public String getTitulo(){
    return titulo;
    }
    public void setTitulo(String titulo){
    this.titulo=titulo;
    }
    public String getAutor(){
    return autor;
    }
    public void setAutor(String autor){
    this.autor=autor;
    }
    public int getNumeroDePaginas(){
    return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas){
    this.numeroDePaginas=numeroDePaginas;
    }
    //sobrecarga de metodos
    public void comparar(int numerodepaginas,int numerodepaginas2,String titulo, String titulo2){
    if(numerodepaginas>numerodepaginas2){
        System.out.println("El libro " + titulo + " tiene "+numerodepaginas+" paginas "
                + " el libro "+ titulo2+ " tiene solo "+ numerodepaginas2+" paginas "
                        + " \nasi que se tienen " + (numerodepaginas-numerodepaginas
                                )+ " de diferencia ");
    }
    else if(numerodepaginas2> numerodepaginas){
       System.out.println("El libro " + titulo2+ " tiene "+numerodepaginas2+" paginas "
                + " el libro "+ titulo+ " tiene solo "+ numerodepaginas+" paginas "
                        + " \nasi que se tienen " + (numerodepaginas2-numerodepaginas
                                )+ " de diferencia ");
    }
    else{
        System.out.println("tienen las mismas paginas los libros "+titulo+" y "+titulo2 );
    }
    }
    //metodo toString
    
    public String toString(){
    String mensaje ="El libro "+getTitulo()+ " con ISBN "+getISBN()+" creado por el autor "+getAutor()+" tiene "
            + getNumeroDePaginas()+" paginas" ;
    return mensaje;

    }
}

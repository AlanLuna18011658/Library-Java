/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

/**
 *
 * @author alanluna
 */
public class Libro {
    
    String ISBN;
    String Título;
    String Autor;
    String Editorial;
    String Año;

    public Libro(String ISBN, String Título, String Autor, String Editorial, String Año) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Año = Año;
    }

    public Libro() {
        
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }
    
}
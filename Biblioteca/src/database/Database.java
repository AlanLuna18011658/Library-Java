/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import libro.Libro;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alanluna
 */
public class Database {
    
    Vector principal = new Vector();
    
    public void guardar(Libro unLibro){
        principal.addElement(unLibro);
    }
    
    public void guardarArchivo(Libro libro){
        try{
            
            FileWriter fw = new FileWriter("Biblioteca.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            try (PrintWriter pw = new PrintWriter(bw)) {
                pw.print(libro.getTítulo());
                pw.print("/"+libro.getISBN());
                pw.print("/"+libro.getAutor());
                pw.print("/"+libro.getEditorial());
                pw.println("/"+libro.getAño());
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public DefaultTableModel espaciodeLibros(){
        Vector favorito = new Vector();
        favorito.addElement("ISBN");
        favorito.addElement("Título");
        favorito.addElement("Autor");
        favorito.addElement("Editorial");
        favorito.addElement("Año");
        
        DefaultTableModel md1Tabla = new DefaultTableModel(favorito,0);
        
        try{
            FileReader fr = new FileReader("Biblioteca.txt");
            BufferedReader bw = new BufferedReader(fr);
            String d;
            while((d=bw.readLine())!=null) {
            StringTokenizer dato = new StringTokenizer(d,"/");
            Vector x = new Vector();
            while(dato.hasMoreTokens()){
                x.addElement(dato.nextToken());
            }
            md1Tabla.addRow(x);
          }
          }catch(IOException e){
             JOptionPane.showMessageDialog(null,e);
        }
        return md1Tabla;
    }

}
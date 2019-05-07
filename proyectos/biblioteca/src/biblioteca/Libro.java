/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ricardofv
 */
public class Libro {
    
    private int isbn;
    private int titulo;
    private int tipo;
    private int editorial;

    public Libro() {
    }

    public Libro(int isbn, int titulo, int tipo, int editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
    }
 
    public int ingresarLibro(ArrayList<Libro> libros) {
        Scanner in = new Scanner(System.in);
        int n,aux=0;
        
        System.out.println("isbn: ");
        n = in.nextInt();        
        for (int i=0;i<libros.size();i++)
        {
            if (n==libros.get(i).getIsbn()) {
                aux=1;
                i=libros.size();
            }
        }
        if (aux == 0) {
            this.setIsbn(n);
            System.out.println("titulo: ");
            n = in.nextInt();
            this.setTitulo(n);
            System.out.println("tipo: ");
            n = in.nextInt();
            this.setTipo(n);
            System.out.println("editorial: ");
            n = in.nextInt();
            this.setEditorial(n);
        } else
            System.out.println("El libro ya se registrado");
        return aux;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    
}

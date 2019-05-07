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
public class Copia {
    
    private int idCopia=0;
    private int isbn;
    private int estadoCopia;
    private int numCopias;

    public Copia() {
    }

    public Copia(int idCopia, int estadoCopia) {
        this.idCopia = idCopia;
        this.estadoCopia = estadoCopia;
    }
    
     public ArrayList<Copia> ingresarCopia(ArrayList<Libro> libros) {
         
        Scanner in = new Scanner(System.in);
        int n,aux=0;
        Copia copia;
        ArrayList<Copia> copias = new ArrayList<Copia>();
        System.out.println("isbn: ");
        n = in.nextInt();        
        for (int i=0;i<libros.size();i++)
        {
            if (n==libros.get(i).getIsbn()) {
                aux=1;
                i=libros.size();
            }
        }
        if (aux == 1) {
            this.setIsbn(n);
            System.out.println("Numero copias: ");
            setNumCopias(in.nextInt());
            for (int i2=0;i2<getNumCopias();i2++)
            {
                copia = new Copia();
                copia.setIdCopia(i2);
                copia.setEstadoCopia(1);
                copia.setIsbn(isbn);
                copia.setNumCopias(numCopias);
                copias.add(copia);
            }
            return copias;
        } else {
            System.out.println("El libro no se registro");
            return null;
        }
        
        
    }

    public int getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(int idCopia) {
        this.idCopia = idCopia;
    }

    public int getEstadoCopia() {
        return estadoCopia;
    }

    public void setEstadoCopia(int estadoCopia) {
        this.estadoCopia = estadoCopia;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    
    
    
}

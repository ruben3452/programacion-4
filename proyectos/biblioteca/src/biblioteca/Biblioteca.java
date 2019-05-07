/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ricardofv
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 1;
        Scanner in = new Scanner(System.in);
        int n, aux=2;
        Lector lector = new Lector();
        ArrayList<Copia> copias =  new ArrayList<Copia>();
        Copia copia = new Copia();
        ArrayList<Libro> libros = new ArrayList<Libro>();
        Libro libro = new Libro();
        Prestamo prestamo = new Prestamo();
        while (op!=0 ) {
            System.out.println("MENU\n");
            System.out.println("1- Ingresar Libro");
            System.out.println("2- Ingresar Copia");
            System.out.println("3- Ingresar Lector");
            System.out.println("4- Hacer prestamo");
            System.out.println("5- Cuantos libros:");
            n = in.nextInt();
            switch (n) {
                case 1:
                    libro = new Libro();
                    aux=libro.ingresarLibro(libros);
                    if (aux==0)
                        libros.add(libro);
                    break;
                case 2:
                    ArrayList<Copia> copias2 =  new ArrayList<Copia>();
                    copias2 = copia.ingresarCopia(libros);  
                    if (copias2!=null)
                    {
                        for (int i=0;i<copias2.size();i++)
                        {   
                            copia = new Copia();
                            copia = copias2.get(i);
                            copias.add(copia);
                        }
                    }
                    break;
                case 3:
                    lector.ingresarLector();
                    break;
                case 4:
                    prestamo.prestar();
                    break; 
                case 5:
                    System.out.println("llevamos: "+libros.size()+" libros");
                    System.out.println("llevamos: "+copias.size()+" copias");
                    break;
            }
            System.out.println("ingreso: " + n+"\n");
        }
    }
                   
}

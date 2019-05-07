package biblioteca;


import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardofv
 */
public class Lector {
    
    private int nSocio;
    private String nombre;
    private String telefono;
    private String direccion;

    public Lector(int nSocio, String nombre, String telefono, String direccion) {
        this.nSocio = nSocio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Lector() {
    }
    
    public void devolver (int id, Date fechaAct) {
        
    }
    
    public void ingresarLector() {
        
    }

    public int getnSocio() {
        return nSocio;
    }

    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

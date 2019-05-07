/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Date;

/**
 *
 * @author ricardofv
 */
public class Prestamo {
    
    private int idCopia;
    private int nSocio;
    private Date fechaIni;
    private Date fechaFin;

    public Prestamo(int idCopia, int nSocio, Date fechaIni, Date fechaFin) {
        this.idCopia = idCopia;
        this.nSocio = nSocio;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public Prestamo() {
    }
    
    public void prestar() {
        
    }

    public int getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(int idCopia) {
        this.idCopia = idCopia;
    }

    public int getnSocio() {
        return nSocio;
    }

    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    
}

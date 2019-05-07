/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author utp
 */
public class library {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;

    public library() {
    this.cadena ="";
    /**this.resultado=0.0;*/
    this.suma=false;
    this.resta=false;
    
    }
    public String concatenamiento(String cadena){
        this.cadena=this.cadena+cadena;
        return this.cadena;
        
    }
   public void suma (String cadena){
       this.resultado=Double.parseDouble(cadena);
       suma=true;
       this.cadena="";
   } 
   public void resta (String cadena){
       this.resultado=Double.parseDouble(cadena);
       resta=true;
       this.cadena="";
   }
   
public double resultado (String numero){
    if(suma==true){
        resultado=resultado+Double.parseDouble(numero);
    }
    
    else if(resta==true){
        resultado=resultado-Double.parseDouble(numero);
    }
   suma=false;
   resta=false;
   return resultado;
   }
}

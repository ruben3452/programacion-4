/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fechas;
import java.io.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author orihime
 */

public class diasfechas {
    
  public ArrayList<datos2> datos2 = new ArrayList<datos2>();
    datos2 datox2; 
    
 public ArrayList<datos> datos = new ArrayList<datos>();
    datos datox;   

   
    public diasfechas() {
    }
    
    
   
    
    public static void main(String []args){
    grafico graph = new grafico();
    graph.setVisible(true);
    graph.setLocationRelativeTo(null);


//datox2 = new datos2();  
    
    /**
     *
     */
    
final long MILISEGUNDOS = 24 * 60 * 60 * 1000; //Milisegundos al día 
java.util.Date hoy = new Date(); //Fecha de hoy 
 //ArrayList<Integer> datos = new ArrayList<>();  

 //datos.año = leer.next(); 
int año;
int mes ;
int dia;

Scanner scanner= new Scanner(System.in);
System.out.println("ańo");
año = scanner.nextInt();
System.out.println("mes");
mes= scanner.nextInt();
System.out.println("dia");
dia= scanner.nextInt();

Calendar c = Calendar.getInstance();

Calendar calendar = new GregorianCalendar(año, mes-1, dia); 

java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis());
 ArrayList<Integer> datosx2 = new ArrayList<>();    
int añox;
long dias;
int semana;

/*long*/ dias = ( hoy.getTime() - fecha.getTime() )/MILISEGUNDOS; 

int dif= c.get(Calendar.MILLISECOND);
 /*int*/ semana=calendar.get(Calendar.DAY_OF_WEEK );
/* int*/ añox= c.get(Calendar.YEAR)-año;
añox--;
System.out.println("su edad "+añox);
System.out.println("dias desde su nacimiento y actualidad: "+dias);

if (semana == 1){
   System.out.println("semana que nacio domingo");
}
if (semana == 2){
   System.out.println("semana que nacio lunes"); 
}
if (semana == 3){
   System.out.println("semana que nacio martes");
}
if (semana == 4){
   System.out.println("semana que nacio miercoles"); 
}
if (semana == 5){
   System.out.println("semana que nacio jueves"); 
}  
   if (semana == 6){
   System.out.println("semana que nacio viernes"); 
}
   if (semana == 7){
   System.out.println("semana que nacio sabado"); 
}

    }




   
   


    /*
    public void pasar_valores(JTable tas){
    diasfechas añox=new diasfechas();
    diasfechas semana=new diasfechas();
    diasfechas dias=new diasfechas();
    String []columnas={"nombre","años","semanas","dias"};
    DefaultTableModel dtm = new DefaultTableModel(null,columnas);
    //String [] filas={"","hola"+añox,""+semana,""+dias};
    dtm.addRow(filas);
    tas.setModel(dtm);
     */

    public ArrayList<datos2> getDatos2() {
        return datos2;
    }

    public void setDatos2(ArrayList<datos2> datos2) {
        this.datos2 = datos2;
    }

    public datos2 getDatox2() {
        return datox2;
    }

    public void setDatox2(datos2 datox2) {
        this.datox2 = datox2;
    }

    public ArrayList<datos> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<datos> datos) {
        this.datos = datos;
    }

    public datos getDatox() {
        return datox;
    }

    public void setDatox(datos datox) {
        this.datox = datox;
    }
    
}

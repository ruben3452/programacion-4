/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fechas;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author orihime
 */
public class grafico1 extends javax.swing.JFrame {
//diasfechas pasa=null;   
   //String []datos =new String[4];
   //DefaultTableModel modelo;
  public ArrayList<datos> datos = new ArrayList<datos>();
    datos datox;
  public ArrayList<datos2> datos2 = new ArrayList<datos2>();
    datos2 datox2;      
    
  public static Boolean estadoDesarrollo=true;
    public static String directorio;
    public static String nombreArchivoTexto="archivo.txt"; 
    
   
    
    
    
    
   



   
    public grafico1() {
        initComponents();
        //modelo= new DefaultTableModel();
        //modelo.addColumn("Nombre");
        //modelo.addColumn("edad");
        //modelo.addColumn("dia");
        //modelo.addColumn("semana");
  
        //this.jTable1.setModel(modelo);
         //pasa=new diasfechas();
    
        //cargartabla();
     
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  
    
        
        if(estadoDesarrollo==true){            
            directorio = System.getProperty("user.dir");
        }else{            
            directorio = System.getProperty("java.class.path"); 
            File dir = new File(directorio);
            directorio= dir.getParent();
        }
        
    }

    

   
    
         public ArrayList<datos> getdatos() {
        return datos;
    }

    public void sedatos(ArrayList<datos> datos) {
        this.datos = datos;
    }
       
         public ArrayList<datos2> getdatos2() {
        return datos2;
    }

    public void sedatos2(ArrayList<datos2> datos2) {
        this.datos2 = datos2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("año");

        jLabel2.setText("dia");

        jLabel3.setText("mes");

        jLabel4.setText("nombre");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "años", "semana", "dias"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleParent(jTextField1);

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(21, 21, 21)
                                    .addComponent(jTextField2)
                                    .addGap(54, 54, 54)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(36, 36, 36)
                                .addComponent(jButton1)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //datos [0]=jTextField4.getText();
      /*
        Object[] filaNueva=
        {
            jTextField2.getText(),
            jTextField3.getText(),
            jTextField1.getText()
        };
        
        
        datox = new datos();
        datox.setNombre(jTextField4.getText());
        datox.setDia(Integer.parseInt(jTextField2.getText()));
        datox.setMes(Integer.parseInt(jTextField3.getText()));
        datox.setAño(Integer.parseInt(jTextField1.getText()));
        datos.add(datox);
       */ 
//String dia=jTextField2.getText();
        //String mes=jTextField3.getText();
         //String año=jTextField1.getText();
         //pasa.pasar_valores(jTable1);
        //modelo.addRow(datos);
        
        
        grafico graficou = new grafico();
        
       final long MILISEGUNDOS = 24 * 60 * 60 * 1000; //Milisegundos al día 
java.util.Date hoy = new Date(); //Fecha de hoy 
 //ArrayList<Integer> datos = new ArrayList<>();  

 //datos.año = leer.next(); 


String cad4=jTextField4.getText();

String cad2=jTextField2.getText();

int dia=Integer.parseInt(cad2);
String cad3=jTextField3.getText();

int mes=Integer.parseInt(cad3);
String cad1=jTextField1.getText();

int año=Integer.parseInt(cad1);
/*
Scanner scanner= new Scanner(System.in);
System.out.println("ańo");
año = scanner.nextInt();
System.out.println("mes");
mes= scanner.nextInt();
System.out.println("dia");
dia= scanner.nextInt();
*/
Calendar c = Calendar.getInstance();

Calendar calendar = new GregorianCalendar(año, mes-1, dia); 

java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis());
// ArrayList<Integer> datos2 = new ArrayList<>();    
int añox ;
long dias;
int semana;
String semana2 = null;
/*long*/ dias = ( hoy.getTime() - fecha.getTime() )/MILISEGUNDOS; 

int dif= c.get(Calendar.MILLISECOND);
 /*int*/ semana=calendar.get(Calendar.DAY_OF_WEEK );
/* int*/ añox= c.get(Calendar.YEAR)-año;
añox--;
System.out.println("su edad "+añox);
System.out.println("dias desde su nacimiento y actualidad: "+dias);

if (semana == 1){
   semana2 =("domingo");
    System.out.println("semana que nacio domingo");
}
if (semana == 2){
   semana2 =("lunes");
    System.out.println("semana que nacio lunes"); 
}
if (semana == 3){
    semana2 =("martes");
   System.out.println("semana que nacio martes");
}
if (semana == 4){
    semana2 =("miercoles");
   System.out.println("semana que nacio miercoles"); 
}
if (semana == 5){
    semana2 =("jueves");
   System.out.println("semana que nacio jueves"); 
}  
   if (semana == 6){
       semana2 =("viernes");
   System.out.println("semana que nacio viernes"); 
}
   if (semana == 7){
       semana2 =("sabado");
   System.out.println("semana que nacio sabado"); 
}

   Object[] filaNueva2=
        {
            
            cad4,
            añox,
            semana2,
            dias
            
        };
   
   DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
            modeloTabla.addRow(filaNueva2);

            jTable1.setModel(modeloTabla);
   datos2.add(datox2);
 //dias =datos2.getDiasvi();  
//datos2.add(añox);    

//datos2.add(dias);
       
       
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cargartabla();
    }//GEN-LAST:event_jButton2ActionPerformed
public void cargartabla() {                                         
        // TODO add your handling code here:
        for (int i = 0; i < datos2.size(); i++) {
            System.out.println("esta es la :" + i + 1 + " -> " + datos2.get(i).getAñoscum());

            Object[] filaNueva2 = {
             //   jTextField1.getText(),
             //   jTextField2.getText()
                //datos.get((i)getNombre(),
                datos2.get(i).getAñoscum(),
                datos2.get(i).getDiasvi(),
                datos2.get(i).getSemana()
            };

  
    
    DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
            modeloTabla.addRow(filaNueva2);

            jTable1.setModel(modeloTabla);
           datos2.add(datox2);
        }
    }
public void crear(){
    try{
            //BufferedWriter ayuda a manejar los streams
            //FileWriter nos ayuda a escribir dentro de archivos
            File archivo = new File (directorio+"/"+nombreArchivoTexto);
            if (!archivo.exists()){
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                //usamos el método .write para escribir la cadena
                bw.write("Garabatos Linux\n"
                    + "Conocimiento libre con software libre");            
                //Muy importante, siempre cerrar el archivo.
                bw.close();
                //jTable1.setText(""); //Limpiamos el JTextArea si hubiera algo
                JOptionPane.showMessageDialog(rootPane, "Archivo creado con éxito");
            }else{
                JOptionPane.showMessageDialog(rootPane, "El archivo ya existe");
            }            
        }catch(IOException e1){
            JOptionPane.showMessageDialog(rootPane, "Error crear archivo");
        }  
}
public void guardar(){
     try{            
            // declaramos la variable archivo como un objeto File
            // y le asignamos una ruta donde se creará
            File archivo = new File (directorio+"/"+nombreArchivoTexto);
            if (archivo.exists()){                
                //BufferedWriter ayuda a manejar los streams
                //FileWriter nos ayuda a escribir dentro de archivos
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                //usamos el método .write para escribir la cadena
                //bw.write(jTable1.get());            
                //Muy importante, siempre cerrar el archivo.
                bw.close();
                //jTable1.setText(""); //Limpiamos el JTextArea por si hubiere algo
                JOptionPane.showMessageDialog(rootPane, "Archivo guardado con éxito");
            }            
        }catch(IOException e1){
            JOptionPane.showMessageDialog(rootPane, "Error al guardar en el archivo");
        }
    
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafico1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    

    
}

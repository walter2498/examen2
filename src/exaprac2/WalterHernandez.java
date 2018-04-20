
package exaprac2;

import javax.swing.JOptionPane;


public class WalterHernandez {

    
    public static void main(String[] args) {
  int lon;
  String nombre="";
  Double salario = 0.0;
  Double desci=0.0;
  Double descr=0.0;
  Double desca=0.0;
  Double nuevosal=0.0;
  int cantida = 0;
  String acum="";
  boolean salir = false;
        int opcion; 
        opcion=Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion:\n"
        +"[1]agregar empleado\n"
        +"[2]calcular planilla\n"
        +"[3]salir\n"        
        ));
     
       
                switch (opcion) {
                    case 1:
                    
                        lon=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos empleados agregara:"));
                        
                        String empleado[]=new String[lon];
                        
                        
                        for(int i=0; i<empleado.length; i++)
                        {
                            
                        nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                        salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora:"));
                        cantida=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de horas trabajadas:"));
                    
                        if(salario>0)
                        {
                         salario=salario*cantida;
                        descr= salario*(0.1);
                        desci= salario*(0.07);
                        desca= salario*(0.04);
                        
                        nuevosal= salario-(descr+desci+desca);
                        }
                        else {
                         JOptionPane.showMessageDialog(null,"!!Ingrese correctamente el salario!!");       
                         
                        }
                          JOptionPane.showMessageDialog(null,"Empleado:\n"+nombre
                         
                         +"\nsalario por hora:"+salario
                         +"\ncantidad de horas laboradas :"+cantida  
                         +"\n Nuevo salario:"+nuevosal
                         );
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Empleado:\n"+nombre
                         
                         +"\nsalario por hora:"+salario
                         +"\ncantidad de horas laboradas :"+cantida  
                         +"\n Nuevo salario:"+nuevosal
                         );
                        
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                         JOptionPane.showMessageDialog(null,"solo numeros entre el 1 y 3");
                }
            } 
 
}

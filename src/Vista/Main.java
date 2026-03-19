/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
import Controlador.SimuladorCredito;

public class Main {
    public static void main(String[]args){
   int opcion;
        JOptionPane.showMessageDialog(null,"======Finanfacil======"+"\n\nPor: Santiago Riaño Cordoba"
                +"\nCodigo: 20242578024");
   //Menú
   do{
 String input = JOptionPane.showInputDialog("======FinanFacil======"
         +"\n1. Calcular capacidad de endeudamiento."
         +"\n2. Simular credito. "
         +"\n3. Simular abono. "
         +"\n4. Salir.");
  opcion = Integer.parseInt(input);
  switch(opcion){
      case 1:
          int a, b;
          input = JOptionPane.showInputDialog("ingrese a:");
          a = Integer.parseInt(input);
          
           input = JOptionPane.showInputDialog("ingrese b:");
          b = Integer.parseInt(input);
          
          int suma = a+b;
          
          JOptionPane.showMessageDialog(null,"suma es: "+suma);
          
          break;
          
      case 2:
          
          break;
          
      case 3:
          
          break;
          
      case 4:
          
          JOptionPane.showMessageDialog(null, "Gracias por usar finanfacil :D.");
          
          break;
  }
   }while (opcion != 4);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JOptionPane;


public class SimuladorCredito {
    
        
    public void CalcularCapacidadEndeudamiento(){
    double IngresosMensuales;
    double GastosFijos;
    
    JOptionPane.showMessageDialog(null, "A continuacion se calculara su capacidad de endeudamiento");
    String input = JOptionPane.showInputDialog("Valor de sus ingresos mensuales: ");
    IngresosMensuales = Double.parseDouble(input);
    
    input = JOptionPane.showInputDialog("Ingrese el valor de sus gastos fijos mensuales");
    GastosFijos = Double.parseDouble(input);

   Double Capacidad = (IngresosMensuales - GastosFijos) * 0.35;
   JOptionPane.showMessageDialog(null, "Su capacidad de endeudamiento es: "+Capacidad);
    }
    
}

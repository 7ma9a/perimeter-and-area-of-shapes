/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

import javax.swing.JOptionPane;

/**
 *
 * @author Zidane
 */
public class Rhombus implements Shape {
    
    public String diagonal1, diagonal2, length; 
    public double NumericDig1,NumericDig2,Numericlength;
    
    public Rhombus(){
        diagonal1= diagonal2= length ="";
        NumericDig1=NumericDig2=Numericlength=0.0d;
    }

    @Override
    public void inputRequired() {
        diagonal1 = JOptionPane.showInputDialog("Enter the length of the first diagonal of your Rhombus:");
        diagonal2 = JOptionPane.showInputDialog("Enter the length of the second diagonal of your Rhombus:");
        length = JOptionPane.showInputDialog("Enter the length of any side of your Rhombus:");

        
        NumericDig1 = Double.parseDouble(diagonal1);           
        NumericDig2 = Double.parseDouble(diagonal2);
        Numericlength = Double.parseDouble(length);
    
    }

    @Override
    public double shapeArea() {
        return (NumericDig1*NumericDig2)/2;
    }

    @Override
    public double shapePerimeter() {
        return 4*Numericlength;
    }
    
}

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
public class Trapezium implements Shape {
    
    public String baseA, baseB, sideC,sideD,height; 
    public double NumericBaseA,NumericBaseB,NumericSideC,NumericSideD,NumericHeight;
    
    public Trapezium(){
        baseA= baseB= sideC=sideD=height="";
        NumericBaseA=NumericBaseB=NumericSideC=NumericSideD=NumericHeight =0.0d;
    }

    @Override
    public void inputRequired() {
        baseA = JOptionPane.showInputDialog("Enter the length of the first Base of your Trapezium:");
        baseB = JOptionPane.showInputDialog("Enter the length of the second Base of your Trapezium:");
        sideC = JOptionPane.showInputDialog("Enter the length of the first side of your Trapezium:");
        sideD = JOptionPane.showInputDialog("Enter the length of the second side of your Trapezium:");
        height = JOptionPane.showInputDialog("Enter the height of your Trapezium:");
        
        NumericBaseA = Double.parseDouble(baseA);           
        NumericBaseB = Double.parseDouble(baseB);
        NumericSideC = Double.parseDouble(sideC);         
        NumericSideD = Double.parseDouble(sideD);
        NumericHeight = Double.parseDouble(height);
        
    }

    @Override
    public double shapeArea() {
        
        return ((NumericBaseA+NumericBaseB)/2)*NumericHeight;
    }

    @Override
    public double shapePerimeter() {
        return NumericBaseA + NumericBaseB + NumericSideC + NumericSideD;
    }
    
}

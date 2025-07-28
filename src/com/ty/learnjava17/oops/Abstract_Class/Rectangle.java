package com.ty.learnjava17.oops.Abstract_Class;

abstract class TwoDShape {
    private double length;
    private double width;
    
    public TwoDShape(double length, double width) {
       this.length = length; 
       this.width = width;    
     }
    // Declaring abstract method
    public abstract void draw();
    // Defining concrete method
    public double getArea() { 
      return length*width; 
    } 
 }
 
 public class Rectangle extends TwoDShape { 
    public Rectangle(double length, double width) {
       super(length,width);    
     }
    public void draw() { 
       System.out.println("Drawing Rectangle"); 
     }     
    public static void main (String args[]) {
       // TwoDShape object referring to rectangle.
       TwoDShape rect = new Rectangle(10,10);
       rect.draw(); 
       System.out.println("Area of given rectangle = "+rect.getArea());
    }
 }


package org.matsim.class2019.basics;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return width*length;
    }
    public static void main(String[] arg){
        Rectangle size = new Rectangle(20,10);
        double a = size.calculateArea();

        System.out.println("The area of the Rectangle is: " + a);
    }
}

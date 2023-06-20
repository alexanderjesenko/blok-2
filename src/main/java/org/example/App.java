package org.example;

import org.example.example1.Car;
import org.example.example2.Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Car car1 = new Car("Toyota", "Camry", 2010);
        System.out.println("Make=" + car1.getMake() + " model=" + car1.getModel() + " year=" + car1.getYear());
        car1.setYear(2020);
        System.out.println("Make=" + car1.getMake() + " model=" + car1.getModel() + " year=" + car1.getYear());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Rectangle= width:"+rectangle.getWidth()+" length:"+rectangle.getLength());
        System.out.println(" Area:"+rectangle.getArea());
        System.out.println(" Perimeter:"+rectangle.getPerimeter());
    }


}

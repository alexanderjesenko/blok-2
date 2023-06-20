package org.example;

import org.example.example1.Car;
import org.example.example2.Rectangle;
import org.example.example3.Animal;
import org.example.example3.Bird;
import org.example.example3.Dog;
import org.example.example4.Cash;
import org.example.example4.CreditCard;
import org.example.example4.PayPal;
import org.example.example4.PaymentMethod;

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

        Animal[] animals = new Animal[] { new Dog(), new Bird()};

        for(Animal animal : animals) {
            animal.makeSound();
            animal.move();
        }

        PaymentMethod[] methods = new PaymentMethod[] { new CreditCard(), new PayPal(), new Cash() };

        int i = 1;
        for(PaymentMethod method : methods) {
            method.paymentMethod(i++);
        }
    }


}

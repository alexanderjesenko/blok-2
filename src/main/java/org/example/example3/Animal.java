package org.example.example3;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void makeSound();

    public void move() {
        System.out.println("Move animal!");
    }
}

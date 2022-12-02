package com.epam.mjc.stage0;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return ("This animal is mostly " + (color) + ". It has " + (numberOfPaws) + ((numberOfPaws > 1) ? " paws and " : " paw and ") + ((hasFur) ? "a" : "no") + " fur.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Yellow", 2, true);
        System.out.println(animal.getDescription());

    }
}

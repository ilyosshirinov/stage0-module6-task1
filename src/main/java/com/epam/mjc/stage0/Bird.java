package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);

    }

    public String getDescription() {
        return ("This animal is mostly " + (color) + ".It has " + (numberOfPaws) + ((numberOfPaws > 1) ? " paws and " : " paw and ") + ((hasFur) ? "a" : "no") + " fur.") + " Moreover, it has " + numberOfPaws + " wings and can fly.";
    }


}

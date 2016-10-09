package model.men;

import model.men.Man;

public class Boy extends Man {

    public Boy(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void draw() {
        System.out.println("We draw boy");
    }

    @Override
    public void speak() {
        System.out.println("We heard boy's voice");
    }
}

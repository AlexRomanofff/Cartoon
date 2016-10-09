package model.men;

public class Girl extends Man {

    public Girl(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void draw() {
        System.out.println("We draw girl");
    }

    @Override
    public void speak() {
        System.out.println("We heard girl's voice");
    }
}

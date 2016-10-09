package model;

import interfaces.Drawable;
import model.animals.Animal;
import model.animals.Monkey;
import model.men.Girl;
import model.men.Man;
import model.plants.Plant;
import model.plants.Tree;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Picture picture = new Picture();

        List<Drawable> elements = new ArrayList<>();

        Man girl = new Girl("Olena", 120, 5);
        Animal monkey = new Monkey("Mimi", 100, Color.GRAY);
        Plant tree = new Tree(300, Color.GREEN);

        elements.add(girl);
        elements.add(monkey);
        elements.add(tree);

        picture.drawPicture(elements);
    }
}

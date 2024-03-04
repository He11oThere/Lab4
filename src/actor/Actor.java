package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import additionalElements.StreetObject;
import enums.EmotionalCondition;
import enums.HungerState;
import interfaces.Eatable;
import interfaces.Sittable;
import interfaces.Swingable;

import java.util.Objects;
import java.util.Random;

public class Actor extends HumanBeing {

    public Actor() {
    }

    public Actor(String name) {
        super(name);
    }

    public Actor(String name, String appearance) {
        super(name, appearance);
    }

    public Actor(String name, EmotionalCondition emotion, HungerState hungerState) {
        super(name, emotion, hungerState);
    }

    public void lookAt(String object) {
        System.out.print(getName() + " смотрит на " + object);
    }

    public void lookAt(Actor person) {
        System.out.print(getName() + " смотрит на " + person.getName());
    }

    public void jump(Actor person) {
        System.out.println(getName() + " " + getAppearance() + " подскочил к " + person.getName());
    }

    public void listen(String noise) {
        System.out.print(getName() + " слушает " + noise);
    }

    public void sing() {
        System.out.print(" петь");
    }

    public void carry(String carryObject, Actor person) {
        System.out.print("носил " + person.getName() + carryObject);
    }

    public void monologue(String sentence, String descriptionOfThoughts) {
        System.out.println("\"" + sentence + "\" - " + think(descriptionOfThoughts));
    }

    public void monologue(String sentence) {
        System.out.println("\"" + sentence + "\"");
    }

    public void getUp() {
        System.out.print(getName() + " поднялся");
    }

    public void wave(HumanBeing person) {
        System.out.print(getName() + " помахал " + person.getName() + " на прощание");
    }

    public void seem(String... something) {
        if (something.length == 0) {
            System.out.print("стало казаться ему ");
        }
        if (something.length == 1) {
            System.out.print("стало казаться ему " + something[0]);
        } else if (something.length == 2) {
            System.out.print("стало казаться ему " + something[0] + " или " + something[1]);
        } else {
            System.out.print("стало казаться ему ");
            for (int x = 0; x < something.length; x++) {
                System.out.print(something[x]);
                if (x < something.length - 2) {
                    System.out.print(", ");
                } else if (x == something.length - 2) {
                    System.out.print(" или ");
                }
            }
        }
    }

    public void happend(String what, String when) {
        System.out.print(what + ", что произошло с " + getName() + " " + when);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

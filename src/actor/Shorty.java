package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import additionalElements.StreetObject;
import enums.EmotionalCondition;
import interfaces.*;

public class Shorty extends Actor implements Eatable, Sittable {

    public Shorty() {
    }

    public Shorty(String name) {
        super(name);
    }

    public Shorty(String name, String appearance) {
        super(name, appearance);
    }

    @Override
    public void sit(Furniture furniture) {
        System.out.print(" сидят за " + furniture.getFurniture());
    }

    @Override
    public void eat(Food food, String action) {
        System.out.println(getName() + action + food.getFoodType());
    }

    public void eat(Food food, String action, String who) {
        System.out.print(who + action + food.getFoodType());
    }

    public void talk(String activeSpeakers) {
        System.out.print(getName() + " разговаривал " + activeSpeakers);
    }

    public void talk(String activeSpeakers, String who) {
        System.out.print(who + " разговаривали " + activeSpeakers);
    }

    public void laugth() {
        System.out.println(" смеялись");
    }

    public void appearanceDescription() {
        System.out.println("У него были " + getAppearance());
    }

    public void appearanceDescription(boolean redactable, String parameter) {
        if (redactable) {
            System.out.println("У них были " + parameter);
        } else {
            appearanceDescription();
        }
    }

//    public void lookAt(String object) {
//        System.out.print(getName() + " смотрят на " + object);
//    }

    public void glanceAt(Actor person, EmotionalCondition emotion) {
        System.out.println(emotion + " поглядывал на " + person.getName());
    }

    public void lookAt(Actor person) {
        System.out.print(" поглядывали на  " + person.getName());
    }

    public void lookAt(Actor person, EmotionalCondition emotion) {
        System.out.print(emotion + " поглядывали на " + person.getName());
    }

    public static void run(String where, Shorty... who) {
        if (who.length == 0) {
            System.out.print("бегал с подносами " + where);
        }
        if (who.length == 1) {
            System.out.print(who[0] + " бегал с подносами " + where);
        } else if (who.length == 2) {
            System.out.print(who[0] + " и " + who[1] + " бегали с подносами " + where);
        } else {
            for (int x = 0; x < who.length; x++) {
                System.out.print(who[x]);
                if (x < who.length - 2) {
                    System.out.print(", ");
                } else if (x == who.length - 2) {
                    System.out.print(" и ");
                }
            }
            System.out.print(" бегали с подносами " + where);
        }
    }

    public static Swingable swingable = new Swingable() {
        @Override
        public String swingOn(StreetObject swingObject) {
            return "покачаться на " + swingObject;
        }
    };

    public static Shakeable shakeable = new Shakeable() {
        @Override
        public String shakeOn(StreetObject shakeObject) {
            return "потрястись на " + shakeObject;
        }
    };

    public static Rideable rideable = new Rideable() {
        @Override
        public String rideOn(StreetObject rideObj) {
            return "прокатиться на " + rideObj;
        }
    };

    public static Spinable spineable = new Spinable() {
        @Override
        public String spinAroundOn(StreetObject spinObj, StreetObject spinObjExtra) {
            return "покружиться на " + spinObj + " или " + spinObjExtra;
        }
    };

//    public void crawl(Object o) {
//        System.out.println(getName() + " карабкались по " + o);
//    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

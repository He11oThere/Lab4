import actor.*;
import additionalElements.*;
import enums.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        ShortiesContainer container = new ShortiesContainer("Коротышки", "приветливые лица");
        Actor neznaika = new Actor("Незнайка", EmotionalCondition.CALM, HungerState.NEUTRAL);
        container.createShorty();
        container.createShorty(); // добавление двух коротышек в контейнер
//        Shorty darkShorty = new Shorty("коротышка", "черненький"); // заменил на официанта ниже (один и тот же персонаж)
        Shorty waiter = new Shorty("Официант", "в черном костюме");
        Furniture table = new Furniture("стол");

        Food soup = new Food("суп", 1);
        Food pasta = new Food(" макароны с сыром", 1);
        Food cabbageRolls = new Food("голубцы", 2);
        Food coffee = new Food("чашечка кофе", 1);
        Food iceCream = new Food("Клубничным мороженным", 1);
        Food dinner = new Food("ужин", 1);

        // выше - старый код

        StreetObject stairs = new StreetObject("лестницам", true);
        StreetObject swing = new StreetObject("качелях", true);
        StreetObject woodenHorses = new StreetObject("заводных деревянных лошадках", true);
        StreetObject specialBicycle = new StreetObject("специальном велосипеде");
        StreetObject carousels = new StreetObject("карусели");
        StreetObject wheel = new StreetObject("чертовом колесе");
        StreetObject mirrors = new StreetObject("кривые зеркала");

        Swingable toSwingOn = (StreetObject swingObj) -> "покачаться на " + swingObj;
        Shakeable toShakeOn = (StreetObject shakeObj) -> "потрястись на " + shakeObj;
        Rideable toRideOn = (StreetObject rideObj) -> "прокатиться на " + rideObj;
        Spinable toSpinAroundOn = (StreetObject spinObj, StreetObject spinObjExtra) -> "покружиться на " + spinObj + ", или хотя бы на " + spinObjExtra;


        container.allCrawlUp(stairs);
        System.out.print(", чтобы ");
//        Swingable toSwingOn = (StreetObject swingObj) -> "покачаться на " + swingObj;
        System.out.print(toSwingOn.swingOn(swing) + ", ");
//        Shakeable toShakeOn = (StreetObject shakeObj) -> "потрястись на " + shakeObj;
        System.out.println(toShakeOn.shakeOn(woodenHorses) + ",");
//        Rideable toRideOn = (StreetObject rideObj) -> "прокатиться на " + rideObj;
        System.out.print(toRideOn.rideOn(specialBicycle) + ", ");
//        Spinable toSpinAroundOn = (StreetObject spinObj, StreetObject spinObjExtra) -> "покружиться на " + spinObj + ", или хотя бы на " + spinObjExtra;
        System.out.println(toSpinAroundOn.spinAroundOn(carousels, wheel));
        mirrors.located(Position.DOWN);
        System.out.print(", и ");
        HumanBeing.laugthEnough("каждый");
        System.out.print(", "); HumanBeing.sight("отражение перекошенной физиономии");

        System.out.println(Position.RIGHT_HERE + " " + Position.IN_FRONT_OF);


        // ниже - старый код

        System.out.println("");
        neznaika.see(null);
        container.allEat(dinner, " ели ");
        neznaika.remember();
        System.out.print(TimePoint.LONG_AGO.getPoint());
        neznaika.hungerLevel(HungerState.HUNGRY);
        System.out.println("");

        neznaika.think();
        System.out.print(" и ");
        neznaika.sit(table);
        System.out.print(TimePoint.RIGHT_NOW.getPoint());
        waiter.jump(neznaika);
        waiter.ask(" Что желаете покушать?");

        System.out.print(neznaika.getName());
        neznaika.eat(soup, " съел ");
        System.out.print(TimePoint.AFTER.getPoint() + " ");
        neznaika.ask();

        neznaika.eat(pasta, "");
        System.out.print("\n" + TimePoint.THEN.getPoint());
        System.out.print(neznaika.getName());
        neznaika.eat(cabbageRolls, " cъел ");
        System.out.print(", ");
        neznaika.drink(coffee);
        System.out.print(", ");
        neznaika.eat(iceCream, "закусил ");
        System.out.println("");
        neznaika.evaluate(" понравилась", " еда");
//        System.out.print(neznaika.getName() + " " + neznaika.getHungerState()); // заменил на один метод
        neznaika.printHungerState();
//         neznaika.hungerLevel(HungerState.FULL);  // исправил реализацию и добавил в метод
        System.out.print(", поэтому ");
        neznaika.emotion(EmotionalCondition.HAPPY);
        System.out.print(" и ");
        neznaika.emotion(EmotionalCondition.KIND);
        System.out.println("");
        neznaika.emotion(EmotionalCondition.HAPPY);
        System.out.print(", поэтому ");
        neznaika.want();
        neznaika.sing();
        System.out.print(" или ");
        neznaika.toDo(" сделать что-то приятное");
        neznaika.sit(table);
        neznaika.listen("музыку");
        System.out.print(" и ");
        neznaika.lookAt("танцующих");
        System.out.print(", и ");
        neznaika.lookAt(container.getWhoIn());
        System.out.print(", которые");
        container.allSit(table);
        container.allTalk("между собой");
        System.out.print(" и");
        container.allLaugth();
        container.allAppearanceDescription();
        waiter.setName("коротышка");
        waiter.setAppearance("черненький");
        System.out.print(waiter.getAppearance() + " ");
        System.out.print(waiter.getName());
        System.out.print(", который ");
        waiter.carry(" еду ", neznaika);
        waiter.glanceAt(neznaika, EmotionalCondition.FRIENDLY);
    }
}
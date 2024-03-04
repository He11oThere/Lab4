package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import enums.EmotionalCondition;
import enums.Position;
import exceptions.NotEnoughShorties;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class ShortiesContainer {
    private List<Shorty> shortiesList;
    private String containPersons;
    private String personsDescription;

    public ShortiesContainer(String containPersons, String personsDescription) {
        this.containPersons = containPersons;
        this.personsDescription = personsDescription;
        this.shortiesList = new ArrayList<>();
    }

    public List<Shorty> getShortiesList() {
        return shortiesList;
    }

    public void setShortiesList(List<Shorty> shortiesList) {
        this.shortiesList = shortiesList;
    }

    public String getContainPersons() {
        return containPersons;
    }

    public void setContainPersons(String whoIn) {
        this.containPersons = containPersons;
    }

    public String getPersonsDescription() {
        return personsDescription;
    }

    public void setPersonsDescription(String personsDescription) {
        this.personsDescription = personsDescription;
    }

    public Shorty createShorty(String name, String appearance) {
        Shorty shorty = new Shorty(name, appearance);
        shortiesList.add(shorty);
        return shorty;
    }

    public Shorty createShorty() {
        Shorty shorty = new Shorty();
        shortiesList.add(shorty);
        return shorty;
    }

    public void allTalk(String activeSpeakers) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            shortiesList.get(0).talk(activeSpeakers, getContainPersons());
//            someShorty.talk(activeSpeakers);
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allLaugth() {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.laugth();
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allAppearanceDescription() {
        if (shortiesList.size() > 1) {
//            Shorty someShorty = shortiesList.get(0);
            shortiesList.get(0).appearanceDescription(true, getPersonsDescription());
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allLookAt(Actor person, EmotionalCondition emotion) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.lookAt(person, emotion);
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allLookAt(Actor person) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.lookAt(person);
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allLookAt(String object) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.lookAt(object);
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allEat(Food food, String action) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.eat(food, action, getContainPersons());
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allSit(Furniture furniture) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.sit(furniture);
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    } // сделать проверку на "многие"

    public void allCrawlUp(Object o) {
        if (shortiesList.size() > 1) {
            System.out.print(getContainPersons() + " карабкались " + Position.UP + " по " + o);
        } else {
            throw new NotEnoughShorties("Недостаточно коротышек");
        }
    }

    public void allDrink(Food... food) {
        if (shortiesList.size() > 1) {
            if (food.length == 1) {
                System.out.print(getContainPersons() + " пили " + food[0]);
            } else {
                System.out.print(getContainPersons() + " пили ");
                for (int x = 0; x < food.length; x++) {
                    System.out.print(food[x]);
                    if (x < food.length - 2) {
                        System.out.print(", ");
                    } else if (x == food.length - 2) {
                        System.out.print(" или ");
                    }
                }
            }
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public String toDo(String action) {
        return action;
    }

    public static void bring(String recipient, String foodToBring) {
        System.out.println("приносили " + recipient + " " + foodToBring);
    }

    @Override
    public String toString() {
        return "ShortiesContainer{" +
                "shortiesList=" + shortiesList +
                ", whoIn='" + containPersons + '\'' +
                ", personsDescription='" + personsDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortiesContainer that = (ShortiesContainer) o;
        return Objects.equals(shortiesList, that.shortiesList) && Objects.equals(containPersons, that.containPersons) && Objects.equals(personsDescription, that.personsDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortiesList, containPersons, personsDescription);
    }
}
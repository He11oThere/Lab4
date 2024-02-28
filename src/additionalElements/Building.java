package additionalElements;

public class Building {
    private String name;
    private boolean isMany = false;
    public Building(String name) {
        this.name = name;
    }

    public Building(String name, boolean isMany) {
        this.name = name;
        this.isMany = isMany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMany() {
        return isMany;
    }

    public void setMany(boolean many) {
        isMany = many;
    }

    public static boolean evaluateCount(Building firstBuilding, Building secondBuilding) {
        if (firstBuilding.isMany && secondBuilding.isMany) {
            return true;
        } else {
            return false;
        }
    }

    public static void uncountable(Building firstBuilding, Building secondBuilding) {
        if (evaluateCount(firstBuilding, secondBuilding)) {
            System.out.print("многочисленными " + firstBuilding.getName() + " и " + secondBuilding.getName());
        } else {
            System.out.print("немногочисленными " + firstBuilding.getName() + " и " + secondBuilding.getName());
        }
    }
}

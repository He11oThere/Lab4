package additionalElements;

import java.util.Objects;

public class Furniture {
    private final String furniture;
    private boolean isMany = false;

    public Furniture(String furniture) {
        this.furniture = furniture;
    }

    public Furniture(String furniture, boolean isMany) {
        this.furniture = furniture;
        this.isMany = isMany;
    }

    public String getFurniture() {
        return furniture;
    }

    public void stood(String... onSmth) {
        if (isMany) {
            if (onSmth.length == 0) {
                System.out.println("стояли " + getFurniture());
            } else {
                System.out.println(onSmth[0] + ", " + "стояли " + getFurniture());
            }
        } else {
            if (onSmth.length == 0) {
                System.out.println("стоял " + getFurniture());
            } else {
                System.out.println(onSmth[0] + ", " + "стоял " + getFurniture());
            }
        }
    }

    public boolean isMany() {
        return isMany;
    }

    public void setMany(boolean many) {
        isMany = many;
    }

    @Override
    public String toString() {
        return getFurniture();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture1 = (Furniture) o;
        return Objects.equals(furniture, furniture1.furniture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(furniture);
    }
}

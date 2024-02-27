package additionalElements;

import enums.Position;

import java.util.Objects;

public class StreetObject {
    private String name;
    private int count;
    private boolean isMany = false;

    public StreetObject(String name) {
        this.name = name;
        this.count = 1;
    }

    public StreetObject(String name, boolean isMany) {
        this.name = name;
        if (isMany) {
            this.isMany = isMany;
        } else {
            this.count = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMany() {
        return isMany;
    }

    public void setMany(boolean many) {
        isMany = many;
    }

    public void located(Position position) {
        System.out.print(position + " были выставлены " + getName());
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetObject that = (StreetObject) o;
        return count == that.count && isMany == that.isMany && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count, isMany);
    }
}

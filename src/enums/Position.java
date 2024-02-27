package enums;

public enum Position {
    DOWN("Внизу"),
    UP("вверх"),
    RIGHT_HERE("тут же"),
    IN_FRONT_OF("перед"),
    RIGHT_ON("прямо на");

    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position;
    }
}

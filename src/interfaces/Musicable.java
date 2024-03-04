package interfaces;

public interface Musicable {
    String MUSIC = "Музыка";

    default void roar(String where) {
        System.out.print(MUSIC + " гремела ");
    }
}

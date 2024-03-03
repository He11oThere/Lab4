package interfaces;

public interface Music {
    String MUSIC = "Музыка";

    default void roar(String where) {
        System.out.print(MUSIC + " гремела ");
    }
}

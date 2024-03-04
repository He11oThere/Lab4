package additionalElements;

import interfaces.Musicable;

public class Sound {
    private final String SOUND;

    public Sound(String SOUND) {
        this.SOUND = SOUND;
    }

    public class Music {
        public void playing(String where) {
            System.out.print(SOUND + " гремела " + where);
        }
    }

//    public static Musicable playing = new Musicable() {
//        @Override
//        public void roar(String where) {
//            System.out.print(MUSIC + " гремела " + where);
//        }
//    };

    @Override
    public String toString() {
        return this.SOUND;
    }
}

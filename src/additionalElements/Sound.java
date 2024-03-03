package additionalElements;

import interfaces.Music;

public class Sound {
    private final String SOUND;

    public Sound(String SOUND) {
        this.SOUND = SOUND;
    }

    public static Music playing = new Music() {
        @Override
        public void roar(String where) {
            System.out.print(MUSIC + " гремела " + where);
        }
    };

    @Override
    public String toString() {
        return this.SOUND;
    }
}

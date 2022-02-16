
/*
 * This supporting file is written by Nicolas Matthew Suhardi
 * Please do not distribute unless given the permisison to do so
 */
import java.util.*;

public class WordRandomizer {
    public static final String[] WORD_BANK = { "obambulate", "absquatulate", "disembogue", "deterge", "wretched",
            "annihilate", "capybara", "inspecting", "recycle", "tiktaalik", "ensorcell", "succus", "obtuse",
            "rhadamanthine", "wheedling", "rebarbative", "platitudinous", "limpid" };

    private Random rand;

    public WordRandomizer() {
        rand = new Random();
    }

    public String generateWord() {
        int index = rand.nextInt(18);
        return WORD_BANK[index];
    }
}

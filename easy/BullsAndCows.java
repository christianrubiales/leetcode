import java.util.ArrayList;
import java.util.List;

public class BullsAndCows {

    public String getHint(String secret, String guess) {
        
        // create lists of characters
        List<Character> secrets = new ArrayList<Character>();
        for (Character c : secret.toCharArray()) {
            secrets.add(c);
        }
        List<Character> guesses = new ArrayList<Character>();
        for (Character c : guess.toCharArray()) {
            guesses.add(c);
        }
        
        // get bulls (to remove, so start from the end)
        List<Integer> bulls = new ArrayList<Integer>();
        for (int i = secrets.size() - 1; i > -1; i--) {
            if (secrets.get(i) == guesses.get(i)) {
                bulls.add(i);
            }
        }
        
        // remove bulls
        for (int index : bulls) {
            secrets.remove(index);
            guesses.remove(index);
        }
        
        // count cows
        int cows = 0;
        for (Character c : guesses) {
            if (secrets.contains(c)) {
                cows++;
                secrets.remove(c);
            }
        }
        
        return bulls.size() + "A" + cows + "B";
    }
}

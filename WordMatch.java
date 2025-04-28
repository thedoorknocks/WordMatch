public class WordMatch{
    private String secret;

    public WordMatch(String secret) {
        this.secret = secret;
    }

    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }
        return count * (int)(Math.pow(guess.length(), 2));
    }
    
    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) == scoreGuess(guess2)) {
            if (guess1.compareTo(guess2) > 0) {
                return guess2;
            }
            return guess1;
        }
        if (scoreGuess(guess1) > scoreGuess(guess2)) {
            return guess1;
        }
        return guess2;
    }
    
    
}
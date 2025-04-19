public class Main {
    public static void main(String[] args) {
        calculateScore("Tin", 5000);
        int newScore = calculateScore("Tin", 5000, 5); // Declare newScore
        System.out.println(newScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score, int balls) {
        score = score - 100 * balls;
        System.out.println("Player " + playerName + " lost " + balls + " number of balls and his score is now " + score);
        return score;
    }
}

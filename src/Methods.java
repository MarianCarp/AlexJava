public class Methods {
    public static void main(String[] args) {
        int score = 800;
        int levelCompleted = 18;
        int bonus = 10;
        int highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your score was " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your score was " + highScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        // -1 is used by programmers to indicate an error
        return -1;
    }
}

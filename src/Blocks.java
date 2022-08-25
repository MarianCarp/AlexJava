public class Blocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000) {
//            System.out.println("Your score was less or equal 5000");
//        } else {
//            System.out.println("You Rock!");
//        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final score was " + finalScore);
        }
        //making new variables
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            finalScore +=1000;
            System.out.println("Your new final score was " + finalScore);
        }

        //reusing variables
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score+(levelCompleted*bonus);
            //here we "forgot" to add 1000 like previous examples...
            System.out.println("Your final score was " +finalScore);
        }
    }
}

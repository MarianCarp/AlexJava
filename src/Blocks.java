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
        if (gameOver){
            int finalScore = score+(levelCompleted*bonus);
            System.out.println("Your final score was "+ finalScore );
        }
    }
}

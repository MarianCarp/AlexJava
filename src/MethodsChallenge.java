public class MethodsChallenge {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Marko",position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Vlad",position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Lemon",position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Alfred",position);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table!");
    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore>1000) {
            return 1;
        }
        else if (playerScore>500&&playerScore<=1000){
            return 2;
        }
        else if (playerScore>100&&playerScore<=500){
            return 3;
        }
        else {
            return 4;
        }
    }
}

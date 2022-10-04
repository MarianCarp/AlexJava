import java.util.Random;

public class RandomDog {

    public static void main(String[] args) {
        String[] dogs ={"Rex","Boa","Foxy","Reina","Max","Maya","Lucky","Chance","Rico"};
        int x = dogs.length;
        Random random = new Random();
        int r = random.nextInt(x);

        System.out.println("The world best dog is... " + dogs[r]);
    }

}

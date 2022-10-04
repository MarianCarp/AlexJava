import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"agnostic", "incredible", "unimaginable","opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "fatty", "goofy", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "shop", "network", "boutique","library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        // generate three random numbers
        Random randomGenerator = new Random();
        int r1 = randomGenerator.nextInt(oneLength);
        int r2 = randomGenerator.nextInt(twoLength);
        int r3 = randomGenerator.nextInt(threeLength);
        // now build a phrase
        String phrase = wordListOne[r1]+ " "+wordListTwo[r2]+" " + wordListThree[r3];
        // print out the phrase
        System.out.println("What we need is a "+phrase);

    }
}

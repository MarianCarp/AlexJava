public class Statements {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println(myVariable);
        System.out.println("This is a test");
        System.out.println("This is" +
                " a test" + " and another" +
                " test" + " and still more " +
                "tests");
        System.out.println("So, a statement is ending with ;");
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one " + anotherVariable + myVariable);
    }
}

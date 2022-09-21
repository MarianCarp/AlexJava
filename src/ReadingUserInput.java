import java.util.Date;
import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year +1900;
        int age = currentYear-yearOfBirth;
        System.out.println("Ok, so you have " + age);
        scanner.nextLine(); //handle next line character (enter key)
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        scanner.close();
    }

}

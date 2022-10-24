import java.util.ArrayList;

public class CarsArrayList {
    public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
        cars.add("Dacia");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Skoda");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Rolls-Royce");

        System.out.println(cars.get(4));
    }
}

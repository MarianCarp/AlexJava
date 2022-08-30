public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(1924));

    }


}

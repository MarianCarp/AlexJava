public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            return false;

        } else return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        }
        return switch (month) {
            case 11, 4, 6, 9 -> 30;
            case 2 -> 28;
            default -> 31;
        };
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println((getDaysInMonth(1, 2020)));
        System.out.println((getDaysInMonth(2, 2020)));
        System.out.println((getDaysInMonth(-1, 2020)));
        System.out.println((getDaysInMonth(1, -2020)));



    }
}


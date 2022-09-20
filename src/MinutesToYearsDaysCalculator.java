public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes){
        if (minutes<0) {
            System.out.println("Invalid Value");
        }
        else{
            long year, days, hours,daysReminder;
            hours = minutes/60;
            days = hours/24;
            year = days/365;
            daysReminder = days%365;

            System.out.println(minutes+" min = " + year + " y and "+daysReminder+" d");
        }

    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

}

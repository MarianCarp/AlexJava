public class SecondsAndMinutes {
    static int h, m, s;

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {

            if (minutes>=60){
                h=minutes/60;
                m=minutes%60;
                s=seconds;
                return h + "h " + m + "m " + s + "s";
            }else {
                h=0;
                m=minutes;
                s=seconds;
                return h + "h " + m + "m " + s + "s";
            }

        }
            else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid value";
        } else  {
            m=seconds/60;
            s=seconds%60;
        }return getDurationString(m,s);

        }



    public static void main(String[] args) {
        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(3500));
        System.out.println(getDurationString(700));
        System.out.println(getDurationString(70));
        System.out.println(getDurationString(50));
        System.out.println(getDurationString(90000,59));

    }

}

public class Challenge2{

    public static String getDurationString(int seconds) {
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds >= 60) {  // Ensures seconds are properly converted
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        return (minutes / 60) + "h " + (minutes % 60) + "m " + seconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(4500));  // 4500 seconds -> 1h 15m 0s
        System.out.println(getDurationString(3600));  // 3600 seconds -> 1h 0m 0s
    }
}

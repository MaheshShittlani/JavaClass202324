public class PrintCurrentTime {
    public static void main(String[] args) {
        // Time elapse from 1-Jan-1970's Mid night
        long totalMilliSeconds = System.currentTimeMillis();
        
        // Compute the total Seconds
        long totalSeconds = totalMilliSeconds / 1000;

        // Compute the current seconds
        long currentSeconds = totalSeconds % 60;

        // Compute the total minutes
        long totalMinutes = totalSeconds / 60;

        // Conver it into IST 
        totalMinutes += 330; // 5 hours 30 minutes
        
        // Compute the current minutes
        long currentMinute = totalMinutes % 60;

        // Compute the total Hours from minutes
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        System.out.println(currentHour + ":" + currentMinute + ":" + currentSeconds);

    }   
}

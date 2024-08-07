public class LeapYear {
    public static void main(String[] args) {
        int yearExample = 2012;

        if (yearExample % 4 != 0 || yearExample % 100 == 0 && yearExample % 400 != 0) {
            System.out.println("Year " + yearExample + " is not a leap year.");
        } else {
            System.out.println("Year " + yearExample + " is a leap year.");
        }
    }
}

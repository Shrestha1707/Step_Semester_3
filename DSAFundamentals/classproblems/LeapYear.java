public class LeapYear {
    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        for (int y : new int[]{2024, 1900, 2000}) {
            System.out.println(isLeap(y) ? "Leap year" : "Not a leap year");
        }
    }
}
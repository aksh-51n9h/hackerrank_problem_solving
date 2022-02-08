import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        System.out.println(get256thDay(year));
    }

    public static String get256thDay(int year) {
        if (year == 1918) return "26.09.1918";
        if (isLeap(year)) return "12.09." + year;
        else return "13.09." + year;

    }

    public static boolean isLeap(int year) {

        if (year % 4 != 0) return false;
        return year <= 1918 || year % 100 != 0 || year % 400 == 0;

    }
}

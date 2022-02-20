import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            System.out.println(getDivisorCount(n));
        }
    }

    public static int getDivisorCount(int num) {
        int numCopy = num;
        int count = 0;
        while (numCopy != 0) {
            int r = numCopy % 10;

            if (r == 0) {
                numCopy /= 10;
                continue;
            }

            if (num % r == 0) count++;

            numCopy /= 10;
        }

        return count;
    }
}

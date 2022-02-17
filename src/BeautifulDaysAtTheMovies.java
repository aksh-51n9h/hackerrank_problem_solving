import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;

        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();

        for (int l = i; l <= j; l++) {
            count += (l - reverse(l)) % k == 0 ? 1 : 0;
        }

        System.out.println(count);
    }

    static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        return rev;
    }
}

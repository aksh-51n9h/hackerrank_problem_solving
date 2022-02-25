import java.util.Scanner;

import static java.lang.Math.*;

public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int lower = (int) ceil(sqrt(a));
            int upper = (int) floor(sqrt(b));

            System.out.println(upper - lower + 1);
        }
    }
}

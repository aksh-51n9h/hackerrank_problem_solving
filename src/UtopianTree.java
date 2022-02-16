import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int h = in.nextInt();
            System.out.println(utopianTree(h));
        }
    }


    public static int utopianTree(int x) {
        if (x == 0) {
            return 1;
        }

        if (x % 2 == 1) {
            return 2 * utopianTree(x - 1);
        }

        return utopianTree(x - 1) + 1;
    }
}

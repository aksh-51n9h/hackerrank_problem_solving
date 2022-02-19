import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        int e = 100;
        int i = 0;

        do {
            i = (i + k) % c.length;

            if (c[i] == 1) {
                e -= 3;
            } else {
                e -= 1;
            }
        } while (i != 0);


        System.out.println(e);
    }
}

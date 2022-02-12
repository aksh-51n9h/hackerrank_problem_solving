import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int dA = Math.abs(x - z);
            int dB = Math.abs(y - z);

            String out;

            if (dA < dB) {
                out = "Cat A";
            } else if (dB < dA) {
                out = "Cat B";
            } else {
                out = "Mouse C";
            }

            System.out.println(out);
        }
    }
}

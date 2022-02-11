import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        int[] kb = new int[n];
        for (int i = 0; i < n; i++) {
            kb[i] = in.nextInt();
        }

        int[] mouse = new int[m];
        for (int i = 0; i < m; i++) {
            mouse[i] = in.nextInt();
        }

        Arrays.sort(kb);
        Arrays.sort(mouse);

        int price = -1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (kb[i] + mouse[j] > b) {
                    break;
                } else if (kb[i] + mouse[j] > price) {
                    price = kb[i] + mouse[j];
                }
            }
        }


        System.out.println(price);
    }
}

import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] bill = new int[n];

        for (int i = 0; i < n; i++) {
            bill[i] = in.nextInt();
        }

        int bCharged = in.nextInt();

        int res = bonAppetit(bill, k, bCharged);
        System.out.println(res == -1 ? "Bon Appetit" : res);
    }

    public static int bonAppetit(int[] bill, int k, int b) {
        int bSum = 0;

        for (int j : bill) {
            bSum += j;
        }

        int aSum = bSum - bill[k];

        int bAvg = bSum/2;
        int aAvg = aSum/2;

        if (b > aAvg){
            return b - aAvg;
        }

        return -1;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        List<Integer> cSum = calcCumulativeSum(s);

        int count = 0;
        for (int i = m - 1; i < cSum.size(); i++) {
            int temp = cSum.get(i);
            if (i - m >= 0) {
                temp = cSum.get(i) - cSum.get(i - m);
            }

            if (temp == d) {
                count++;
            }
        }

        return count;
    }

    public static List<Integer> calcCumulativeSum(List<Integer> arr) {
        List<Integer> cSum = new ArrayList<Integer>();

        cSum.add(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {
            int e = arr.get(i);

            cSum.add(cSum.get(i - 1) + e);
        }

        System.out.println();

        return cSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<Integer>();
        String inputs[]  = br.readLine().trim().split(" ");

        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(inputs[i]));
        }

        String a[] = br.readLine().split(" ");

        int d = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);

        System.out.println(birthday(arr, d, m));
    }
}


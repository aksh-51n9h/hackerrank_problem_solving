import java.util.Scanner;

public class FairRations{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solve(arr));
    }

    static String solve(int[] B) {
        int count = 0;
        for (int i = 0; i < B.length-1; i++) {
            if (B[i]%2!=0){
                B[i]++;
                B[i+1]++;
                count++;
            }
        }
        if (B[B.length-1]%2!=0) return "NO";
        return String.valueOf(count*2);
    }
}
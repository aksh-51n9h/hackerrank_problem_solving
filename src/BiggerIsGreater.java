import java.util.Scanner;

public class BiggerIsGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        in.nextLine();
        for (int i = 0; i < t; i++) {
            String s = in.nextLine();

            char[] arr = new char[s.length()];

            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j);
            }

            System.out.println(nextLexString(arr));
        }
    }


    public static String nextLexString(char[] arr) {
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1])
                break;
        }

        if (i==0){
            return "no answer";
        }


        for (int j = i; j < arr.length; j++) {
            int minIdx = j;
            for (int k = j+1; k < arr.length; k++) {
                if(arr[k]<arr[minIdx]){
                    minIdx = k;
                }
            }

            if(minIdx != j){
                char t = arr[j];
                arr[j] = arr[minIdx];
                arr[minIdx] = t;
            }
        }

        int nextMax = i-1;
        for (int j = i; j < arr.length; j++) {
            if(arr[j] > arr[nextMax]){
                nextMax = j;
                break;
            }
        }

        char t = arr[i-1];
        arr[i-1] = arr[nextMax];
        arr[nextMax] = t;

        StringBuilder s = new StringBuilder();

        for (char c : arr) {
            s.append(c);
        }

        return s.toString();
    }
}

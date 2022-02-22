import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        Stack stack = new Stack(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }

        if (res.length() != 0)
            System.out.println(res);
        else
            System.out.println("Empty String");
    }
}

class Stack {
    int top = -1;
    char[] arr;

    Stack(int n) {
        arr = new char[n];
    }

    void push(char c) {
        if (!isFull()) {
            arr[++top] = c;
        }
    }


    char pop() {
        if (!isEmpty()) {
            return arr[top--];
        }

        return '\0';
    }


    char peek() {
        if (!isEmpty()) {
            return arr[top];
        }

        return '\0';
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }
}

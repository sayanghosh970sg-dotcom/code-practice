import java.util.*;

public class pattern {
    public static int calfactorial(int n) {

        if (n == 0 || n < 0) {
            System.out.println("INVALID");
            return 0;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = calfactorial(n);
        System.out.println(" the factorial of " + n + " is:" + factorial);
    }
}

 import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int f = 1; 
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

    


import java.util.Scanner;
 class Solution {
    public boolean Palindrome(int x) {
        if (x < 0) {
            return false; 
        }

        int palindrome = x;
        int reverse = 0;

        while (x != 0) {
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x = x/ 10;
        }

        return palindrome == reverse;
        
    }
      public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        boolean result = Palindrome(x); 
        System.out.println(result);
    }
}
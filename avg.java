import java.util.Scanner;

class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println(average(num1, num2, num3));
    }

    public static double average(double num1, double num2, double num3) {
        double avg;
        avg = (num1 + num2 + num3) / 3;
        return avg;
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter marks of English:");
        int a = sc.nextInt();
        System.out.println("Enter marks of Maths:");
        int b = sc.nextInt();
        System.out.println("Enter marks of Marathi:");
        int c = sc.nextInt();
        System.out.println("Enter marks of Hindi:");
        int d = sc.nextInt();
        System.out.println("Enter marks of CS:");
        int e = sc.nextInt();
        float Totalmarks = a + b + c + d + e;
        float percentage = (Totalmarks / 500) * 100;
        System.out.println("Percentage scored by" + name + "is"
                + percentage + "%");

    }

} 

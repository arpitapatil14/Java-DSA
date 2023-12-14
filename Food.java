// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Order");
        String food = sc.nextLine();
        int platenumber=0;
        switch(food){
            case "Chole Bhature":
                System.out.println("How many plates?");
                platenumber = sc.nextInt();
                break;
            case "Pav Bhaji":
                System.out.println("How many plates?");
                platenumber = sc.nextInt();
                System.out.println(platenumber);
                break;
            case "Misal Pav":
                System.out.println("How many plates?");
                platenumber = sc.nextInt();
                System.out.println(platenumber);
                break;
            case "Jalebi Fafda":
                System.out.println("How many plates?");
                platenumber = sc.nextInt();
                System.out.println(platenumber); 
                break;
            default:
            System.out.println("Thanks for your order ");
            break;
                
        }
    }
}
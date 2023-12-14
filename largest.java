import java.util.Scanner;
public class largest {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
    System.out.println("Enter num1");
    int num1 = sc.nextInt();
    System.out.println("Enter num2");
    int num2 = sc.nextInt();
    System.out.println("Enter num3");
    int num3 = sc.nextInt();
     int max =num1;
     if(num2>num1){
        max=num2;
     }
     if(num3>max){
        max=num3;
     }
     System.out.println(max);

    }
   
    
}

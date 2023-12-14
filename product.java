import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         int pro = product(a,b);
       
        System.out.println( pro);
    }
    
    
    public static int product(int a, int b){
        int product= a*b;
        return product;
    }
    
}

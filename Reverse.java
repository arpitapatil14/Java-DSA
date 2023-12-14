import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name= sc.nextLine();
        int length= name.length();
        String reversed_name = "" ;
        for(int i =length - 1; i>=0;i--){
            reversed_name += name.charAt(i);

        }
        System.out.println("Reversed Name :" + reversed_name);
            
        
    }
       
}
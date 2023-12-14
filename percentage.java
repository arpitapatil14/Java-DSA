import java.util.Scanner;

class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your English marks:");
        int m1= sc.nextInt();
        System.out.println("Enter your Marathi marks:");
        int m2= sc.nextInt();
        System.out.println("Enter your Maths marks:");
        int m3= sc.nextInt();
        
        float avg =(m1+m2+m3)/3;
        System.out.println("Percentage:" +avg);
        
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
      
    }
}

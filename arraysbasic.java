import java.util.Scanner;
public class arraysbasic {
    public static void main(String args[]){

        int marks[] = new int[4];
        Scanner sc = new Scanner (System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();

        System.out.println("Marks :" + marks[0]);
        System.out.println("Marks :" + marks[1]);
        System.out.println("Marks :" + marks[2]);
        System.out.println("Marks :" + marks[3]);

        marks[2]=100; //update
        System.out.println("Marks :" + marks[2]);


        marks[3]= marks[3]+1;

        System.out.println("length of array is :" + marks.length); //length pf array 




    }
    
}

import java.util.Scanner;
public class linearseacrh {
    public static void main(String[] args) {
        int[] arr={12,14,3,45,67,5,87,99,56,22,0,65};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of target");
        int target=sc.nextInt();
        System.out.println(linearsearching(arr,target));
    }

    static int  linearsearching(int[] arr, int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
            //return -1 false
        }
        for(int index=0;index<arr.length;index++){
            if(target==arr[index]){
                return index;
            }
        }
        return Integer.MAX_VALUE;
        //return -1 true

    } 
    
}

import java.util.Scanner;
import java.util.Arrays; // You need to import the Arrays class

public class searchin2d {
    public static void main(String[] args) {
        int[][] arr={
            {28,4,1},
            {78,99,34,56},
            {18,12}
        };
        Scanner sc= new Scanner(System.in);
        System.out,println("Enter the value of target:");
        int target =sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}

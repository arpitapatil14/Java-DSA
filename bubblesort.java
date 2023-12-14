import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2};
        int parse = bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(parse);
    }

    static int bubble(int[] arr) {
        int parse = 0; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                parse = i; 
            }
        }
        return parse; 
    }
}

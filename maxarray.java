import java.util.Arrays;
public class maxarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 19, 8};
        int maxVal = max(arr);
        System.out.println("Max value in the array: " + maxVal);
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

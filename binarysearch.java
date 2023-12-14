import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + (end-start)) / 2;

            if (target == arr[middle]) {
                System.out.println("Element found at index: " + middle);
                return;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        System.out.println("Element not found in the array.");
    }
}

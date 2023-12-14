public class min {
    public static void main(String[] args) {
        int[] arr ={18,12,-7,3,14,28};
        System.out.println(min(arr));
        
    }

    static int min(int[] arr){
        int min=18;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
         return min;



    }
    
}

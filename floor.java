public class floor {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target =22;
        int ans= floors(arr,target);
        System.out.println(ans);
        

    }
    static int floors(int[] arr ,int target){
        int start=0;
        int end=arr.length-1;

       


        while(start<=end){
            int middle= (start+(end-start)/2);

            if(arr[middle]== target){
                return middle;
            }
                 if(target>arr[middle]){
                start=middle+1;
            }
            else {
                end=middle-1;
            }

            
           
            
            }
           
            
        
        return end; 



    }
}

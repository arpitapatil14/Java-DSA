class even{
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           int num= nums[i]; 
           int digit=0;
           while(num>0){
               digit++;
               num=num/10;
           }
           
            if (digit % 2 == 0) {
                count++;
            }

        }

         return count;

    }
}
//class even{
//     public int findNumbers(int[] nums) {
//         System.out.println(digit2);
      


//     }
//     static int digit(int[] nums){
//                 return(int)(Math.log10(num))+1;

//     }
// }


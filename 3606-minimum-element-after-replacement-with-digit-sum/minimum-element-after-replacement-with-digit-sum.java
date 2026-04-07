class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int [] arr=new int[n];
       // int min;
        for(int i=0;i<n;i++){
            int sum=0;
            int a=nums[i];
            while(a>0){
                sum+=a%10;
                a=a/10;

            }
            arr[i]=sum;
           
        }
       int  min =arr[0];
        for(int i=1;i<arr.length;i++){
          if(min > arr[i]){
           min=arr[i];
          }
        }
       
       return min; 
    }
}
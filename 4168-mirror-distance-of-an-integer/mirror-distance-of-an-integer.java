class Solution {
    public int mirrorDistance(int n) {
        int reversed=0;
        int original=n;
       while(n!=0){
         int num=n%10;
         reversed=reversed*10+num;
         n/=10;
       }
      int ans=Math.abs(original-reversed);
       return ans;
        
    }
}
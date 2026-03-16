class Solution {
    public int heightChecker(int[] height) {
        int [] arr= Arrays.copyOf(height,height.length);
       
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<height.length;i++){
           
                if(height[i] != arr[i]){
                    ans++;
                }
            
        }
        return ans;
    }
}
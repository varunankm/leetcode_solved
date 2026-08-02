class Solution {
    public int[] sortArrayByParity(int[] nums) {
       List<Integer> l1=new ArrayList<>();
       List<Integer> l2=new ArrayList<>();
       for(int i:nums){
        if(i%2==0){
            l1.add(i);
        }else{
            l2.add(i);
        }
       }
     int k=0;
     for(int i:l1){
        nums[k]=i;
        k++;
     }
     for(int i:l2){
        nums[k]=i;
        k++;
     }
      return nums;
    }
}
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
      List<Integer> ans=new ArrayList<>();
      for(int i:l1){
        ans.add(i);
      }
      for(int i:l2){
        ans.add(i);
      }
      for(int i=0;i<ans.size();i++){
        nums[i]=ans.get(i);
      }
      return nums;
    }
}
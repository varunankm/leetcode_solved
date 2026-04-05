class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n= nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr2.add(nums[i]);
            }
            else if(nums[i]<pivot){
                arr1.add(nums[i]);
            }
            else{
                equal.add(nums[i]);
            }
        }
        arr1.addAll(equal);
        arr1.addAll(arr2);
        int [] ans=new int[n];
        for(int i=0;i<arr1.size();i++){
            ans[i]=arr1.get(i);
        }
        
      return ans;   
    }
}
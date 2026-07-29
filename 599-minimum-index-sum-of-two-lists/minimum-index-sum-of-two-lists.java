class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            String s=list1[i];
            for(int j=0;j<list2.length;j++){
                if(s.equals(list2[j])){
                    int n=i+j;
                    l.add(list2[j]);
                    l1.add(n);
                }
            }
        } 
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)<min){
                min=l1.get(i);
            }
        } 
        for(int i=0;i<l1.size();i++){
            if(min==l1.get(i)){
                ans.add(l.get(i));
            }
        } 
        String arr[]=new String[ans.size()];
        for(int i=0;i<arr.length;i++ ){
            arr[i]=ans.get(i);
        } 
        return arr;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int c=0;
        Set<Integer> st=new HashSet<>();
        for(int i:mp.keySet()){
           c++;
           st.add(mp.get(i));
        }
        if(st.size()!=c){
        return false;
        }
        
        return true;
    }
}
class Solution {
    public int finalValueAfterOperations(String[] ope) {
        int ans=0;
        for(int i=0;i<ope.length;i++){
            if(ope[i].equals("++X")||ope[i].equals("X++")){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
}
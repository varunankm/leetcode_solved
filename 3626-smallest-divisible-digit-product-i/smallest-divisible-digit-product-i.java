class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        for(int i=n;i<n+10;i++){
            int p=i;
            int mul=1;
            while(p!=0){
                int digit=p%10;
                mul*=digit;
                p/=10;
            }
            if(mul%t==0){
             ans=i;
             break;
            }
        }
        return ans;
    }
}
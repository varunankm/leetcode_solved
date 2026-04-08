class Solution {
    public String generateTheString(int n) {
        StringBuilder str= new StringBuilder();
        if(n%2==0){
            n=n-1;
            for(int i=0;i<n;i++){
                str.append('a');
            }
            str.append('b');
        }
        else{
            for(int i=0;i<n;i++){
                str.append('a');
            }
        }
        return str.toString();
        
    }
}
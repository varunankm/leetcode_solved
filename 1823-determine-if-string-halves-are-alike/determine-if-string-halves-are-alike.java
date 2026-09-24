class Solution {
    public int vcount(String k){
        int count=0;
        char [] c=k.toCharArray();
        for(int i=0;i<c.length;i++){
     if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
           count++;    
                
            }

        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        String l=s.substring(0,n);
        String r=s.substring(n,s.length());
       
        if(vcount(r)==vcount(l)){
            return true;
        }
        return false;
    }
}
class Solution {
    public String sortVowels(String s) {
        char [] c=s.toCharArray();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                l.add(c[i]);
              c[i]='0';
                
            }
        }
        Collections.sort(l);
        String ans="";
        int z=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='0'){
                ans+=l.get(z);
                z++;
            }else{
                ans+=c[i];
            }
        }
        return ans;
    }
}
class Solution {
    public int prefixCount(String[] words, String pref) {
        int a=0;
        for(int i=0;i<words.length;i++){
            boolean matches = words[i].startsWith(pref);
            if(matches==true){
                a++;
            }
        }
        return a;
    }
}
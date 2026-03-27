class Solution {
    public int mostWordsFound(String[] sentences) {
        
     int max=0;
     for(int i=0;i<sentences.length;i++){
        String [] ans=sentences[i].split(" ");
        int a=ans.length;
        if(a>=max){
            max=a;
        }
     }
     return max;
    }
}
class Solution {
    public int compress(char[] ch) {
        TreeMap<Character,Integer> map=new TreeMap<>();
         StringBuilder str=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        if(i==ch.length-1 || ch[i]!=ch[i+1]){
       
        for(char c:map.keySet()){
            str.append(c);
            if(map.get(c)>1){
           str.append(String.valueOf(map.get(c)));
            }
        }
        map.clear();
        }
        }
        int n=0;
        for(char c:str.toString().toCharArray()){
            ch[n++]=c;
            
        }
        return str.length();

    
    }
}

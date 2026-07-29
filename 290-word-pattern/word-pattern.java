class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] str=s.split("\\s+");
        char ch[]=pattern.toCharArray();
        HashMap<Character,String> map=new HashMap<>();
       HashMap<String,Character> map1=new HashMap<>();
       if(ch.length!=str.length) return false;
       for(int i=0;i<ch.length;i++){
        String k=str[i];
         if(map.containsKey(ch[i])){
             if(!map.get(ch[i]).equals(k)){
                return false;
             }
         }else{
            map.put(ch[i],k);
         }
       }
       for(int i=0;i<str.length;i++){
             char k=ch[i];
             if(map1.containsKey(str[i])){
                if(!map1.get(str[i]).equals(k)){
                    return false;
                }
             }else{
                map1.put(str[i],k);
             }
       }
       return true;
    }
}
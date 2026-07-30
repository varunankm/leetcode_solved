class Solution {
    public int minSteps(String s, String t) {
    //    int ch[]=new int[26];
    //    for(int i=0;i<s.length();i++){
    //     ch[s.charAt(i)-'a']++;
    //     ch[t.charAt(i)-'a']--;
    //    }
    //    int count=0;
    //    for(int n:ch){
    //     if(n>0){
    //         count+=n;
    //     }
    //    }
    //   return count;
    int count=0;
    HashMap<Character,Integer> map=new HashMap<>();
    for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
      for(char c:t.toCharArray()){
        map.put(c,map.getOrDefault(c,0)-1);
    }
    for(char c:map.keySet()){
        if(map.get(c)>0){
            count+=map.get(c);
        }
    }
    return count;
    }
}
class Solution {
    public int countSymmetricIntegers(int low, int high) {
      int c=0;
      for(int i=low;i<=high;i++){
        String str=i+"";
        int f=0;
        int l=0;

            if (str.length() % 2 != 0) {
                continue;
            }

        for(int j=0;j<str.length()/2;j++){
            f+=Integer.parseInt(String.valueOf(str.charAt(j))); 
        }
         for(int j=str.length()/2;j<str.length();j++){
            l+=Integer.parseInt(String.valueOf(str.charAt(j))); 
        }
        if(f==l) c++;
        f=0;
        l=0;

      } 
      return c; 
    }
}   
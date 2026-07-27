class Solution {
    public boolean hasSameDigits(String s) {
        boolean ans=false;
        String a=s;
        while(a.length()>2){
             String b="";
            for(int i=0;i<a.length()-1;i++){
                // int h=(Integer.parseInt(a[i])+Integer.parseInt(a[i+1]))%10;
                int h=(Character.getNumericValue(a.charAt(i))+Character.getNumericValue(a.charAt(i+1)))%10;
                b+=h+"";
            }
            a=b;
        }

         return a.charAt(0) == a.charAt(1);
        
    }
}
class Solution {
    public int countTestedDevices(int[] battery) {
        int count = 0;
         for(int i = 0; i < battery.length; i++){
            if(battery[i] - count > 0){
                count++;
            }
        }
       return count;
    }
}
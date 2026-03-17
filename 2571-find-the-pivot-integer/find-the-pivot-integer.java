class Solution {
    public int pivotInteger(int n) {
         int totalSum = n * (n + 1) / 2;
          double pivot = Math.sqrt(totalSum);
            if (pivot - Math.ceil(pivot) == 0) {
                 return (int) pivot;
                  } 

        return -1;
    }
}
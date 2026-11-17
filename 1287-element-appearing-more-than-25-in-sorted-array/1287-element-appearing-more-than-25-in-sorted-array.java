class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n/4;

        int count = 1;
        int curr = arr[0];

        for(int i = 1; i < n; i++){

            if(curr == arr[i]){
                count++;
            }else{
                count = 1;
                curr = arr[i];
            }

            if (count > threshold){
                return curr;
            }
        }

        return curr;
    }
}
class Solution {
    public int fib(int n) {
        if( n==0 ){
            return 0;
        }
        if( n==1 ){
            return 1;
        }

        int m1 = fib(n-1);
        int m2 = fib(n-2);

        return m1+m2;
    }
}
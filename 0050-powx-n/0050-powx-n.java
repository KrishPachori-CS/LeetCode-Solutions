class Solution {
    public double myPow(double x, int n) {
        long power = n;
        boolean negative = power<0;

        if(negative){
            power = -power;
        }

        double ans = pow(x, power);

        if(negative){
            return 1 / ans; 
        }

        return ans;
        }

        public double pow(double x, long n){
            if(n == 0){
                return 1;
            }

            double half = pow(x, n/2);

            if(n % 2 == 0){
                return half*half;
            }

            return x*half*half;
        }

}

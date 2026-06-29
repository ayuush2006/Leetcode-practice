class Solution {
    public double myPow(double x, int n) {
       // mandatory
       long power = n;
       double ans = 1.0;
// power is neegative 
        if (power <0){
           x = 1/x ;
           power = - power ;
   }
       while (power > 0){
             if (power % 2 == 0){
                 x = x *x ;
                 power = power/2;
    }
       else {
             ans = ans * x;
             power = power - 1;
       }
   }
    return ans;
}
    }

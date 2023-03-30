package src.oops;

public class divideTwoInteger {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(dividend==0){
            return 0;
        }
        if(dividend<0 && divisor<0){

            int res=Math.abs(dividend/divisor);
            if(res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            return res;
        }
        if(dividend<0 || divisor<0){
            int res=-Math.abs(dividend/divisor);
            if(res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return res;
        }
        return Math.abs(dividend/divisor);
    }
}

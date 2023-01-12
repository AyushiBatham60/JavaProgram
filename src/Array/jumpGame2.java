package src.Array;

public class jumpGame2 {
    public static void main(String[] args) {
        int[] ar={2,3,1,1,4};
        System.out.println(jump(ar));
    }
    public static int jump(int[] nums) {
        int[] jump=new int[nums.length];
        int i,j;
        if(nums.length==1){
            return 0;
        }
        jump[0]=0;
        for(i=1;i<nums.length;i++){
            jump[i]=Integer.MAX_VALUE;
            for(j=0;j<i;j++){
                if(i<=j+nums[j] && jump[j]!=Integer.MAX_VALUE){
                    jump[i]=Math.min(jump[i],jump[j]+1);
                    break;
                }

            }
        }
        return jump[nums.length-1];
    }
}

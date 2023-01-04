package src.Array;

public class rainWaterTrap {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maximumWater(arr));
    }
    public static  int maximumWater(int[] height) {
        int h=height.length-1;
        int res=0;
        int l=0;
        while(l<h){
            res=Math.max(res,Math.min(height[h],height[l])*(h-l));
            if(height[l]>height[h]){
                h--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}

package src.Array;

public class circularArray {

    public static void main(String[] args) {
        int[] ar={1,2,-11,5,-10,3,4};
        System.out.println(circularArray(ar));
    }
    public static int circularArray(int[] arr){
        int totalSum=0;
        int negStart=-1;
        int negEnd=-1;
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
            if(arr[i]<0){
                if(negStart==-1){
                    negStart=i;
                }
                negEnd=i;
            }
        }
        int negSum=0;
        for (int i = negStart; i <=negEnd ; i++) {
            negSum+=arr[i];
        }
        int sum=totalSum-negSum;
        return sum;

    }
}

package src.Array;

public class binarySearch {
    public static void main(String[] args) {
        int[] ar={10,20,30,54,70};
        System.out.println(binarySearch(ar,5));
    }
    public static int binarySearch(int[] array,int ele){
        int li=0;
        int hi=array.length-1;
        while (li<hi){
            int mid=(li+hi)/2;
            if(array[mid]<ele){
                li=mid+1;
            }
            else if(array[mid]>ele){
                hi=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

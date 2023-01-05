package src.Array;

import java.util.ArrayList;

public class medianOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1=0;
        int s2=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(s1<nums1.length && s2<nums2.length){
            if(nums1[s1]<=nums2[s2]){
                al.add(nums1[s1]);
                s1++;
            }
            else{
                al.add(nums2[s2]);
                s2++;
            }
        }
        while(s1<nums1.length){
            al.add(nums1[s1]);
            s1++;
        }
        while(s2<nums2.length){
            al.add(nums2[s2]);
            s2++;
        }
        double ans=0;
        if(al.size()%2==0){
            ans=al.get(al.size()/2)+al.get(al.size()/2-1);
            ans/=2;
        }
        else{
            ans=al.get(al.size()/2);

        }
        return ans;

    }
}

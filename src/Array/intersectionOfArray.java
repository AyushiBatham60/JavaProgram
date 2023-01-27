package src.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class intersectionOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[m];
        for (int i = 0; i < n; i++) {
            array1[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            array2[i]=sc.nextInt();
        }
        intersection(array1,array2);
    }
    public static void intersection(int[] ar1,int[] ar2){
        List<Integer> ans=new ArrayList<>();
        if(ar1.length>ar2.length){
            for (int i = 0; i < ar1.length; i++) {
                boolean isPresent=false;
                for (int j = 0; j <ar2.length ; j++) {
                    if(ar1[i]==ar2[j])isPresent=true;
                }
                if(isPresent){
                    ans.add(ar1[i]);
                }
            }
        }
        else {
            for (int i = 0; i < ar2.length; i++) {
                boolean isPresent=false;
                for (int j = 0; j <ar1.length ; j++) {
                    if(ar2[i]==ar1[j]) {
                        isPresent = true;
                        break;
                    }
                }
                if(isPresent && !ans.contains(ar2[i])){
                    ans.add(ar2[i]);
                }
            }
        }
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}

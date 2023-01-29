package src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class pair_of_roses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        while (testCases>0){
            int size=sc.nextInt();
            int[] arr=new int[size];
            for (int i = 0; i <size ; i++) {
                arr[i]= sc.nextInt();
            }
            int target=sc.nextInt();
            pairOfRoses(arr,target);
            testCases--;
        }
    }
    public static void pairOfRoses(int[] arr,int totalRupee){
        int element1=0;
        int element2=0;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int sum=arr[i]+arr[j];
                if(sum==totalRupee ) {
                    if(element2!=0&&element1!=0 ) {
                        if((element2-element1)>(arr[j]-arr[i]))
                        element1 = arr[i];
                        element2 = arr[j];
                    }
                    else {
                        element1 = arr[i];
                        element2 = arr[j];
                    }
                }
            }
        }

        System.out.println("Deepak should buy roses whose prices are "+element1 +" and "+element2+".");
    }
}

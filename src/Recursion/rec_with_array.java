package src.Recursion;

public class rec_with_array {
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] ar={10,20,30,40,30};
        print_reverse(ar,0);
        //System.out.println("maximum is "+maximum_of_array(ar,0));
        System.out.println("first occurence of 30 is at : "+first_occurenece(ar,30,0));
        System.out.print("last occurence of 30 is at : ");
        last_occurence(ar,30,0);
        System.out.print("all  occurence of 30 is at : ");
        allOccurence(ar,30,0);
    }
    public static void print_reverse(int[] ar,int index){
        if(index==ar.length) return;

        print_reverse(ar,index+1);
        System.out.println(ar[index]);

    }
    public static int maximum_of_array(int[] arr,int index){
        if(arr.length==index) {

            return max;
        }

        if(arr[index]>max) max=arr[index];
        return maximum_of_array(arr,index+1);
    }
    public static int first_occurenece(int[] arr,int ele,int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==ele){
            return index;
        }

        return first_occurenece(arr,ele,index+1);
    }
    static int elementIndex=-1;
    public static void last_occurence(int[] arr,int ele,int index){
        if(arr.length==index){
            System.out.println(elementIndex);
            return;
        }
        if(arr[index]==ele){
            elementIndex=index;
        }
        last_occurence(arr,ele,index+1);
    }
    public static void allOccurence(int[] arr,int ele,int index){
        if (index==arr.length) return;
        if(arr[index]==ele){
            System.out.print(index+",");
        }
        allOccurence(arr,ele,index+1);
    }
}

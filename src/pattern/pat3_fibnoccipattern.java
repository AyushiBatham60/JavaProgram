package src.pattern;

public class pat3_fibnoccipattern {
    public static void main(String[] args) {
        fibnocci_pattern(5);
    }
    public static void fibnocci_pattern(int totalRows){
        int numberOfFibnocciNumber=(totalRows *(totalRows +1))/2;
        int row=1;
        int a=0;
        int b=1;
        while (row<=totalRows){
            for (int i = 1; i <=row ; i++) {
                System.out.print(a+" ");
                int sum=a+b;
                a=b;
                b=sum;
            }
            row++;
            System.out.println();
        }
    }
}

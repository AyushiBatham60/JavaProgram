package src.Recursion;

public class english_ruler {
    public static void main(String[] args) {
        ruler(3,2);
    }
    public static void ruler(int tick ,int length){
        for (int i = 0; i <length; i++) {
            for (int j = 0; j < tick; j++) {
                System.out.print("-");
            }
            System.out.print(i);
            pat(tick-1);
        }
        for (int j = 1; j <= tick; j++) {
            System.out.print("-");
        }
        System.out.println(length);


    }
    public static void pat(int tick){
          if(tick==0){
              System.out.println();
              return;
          }

          pat(tick-1);
          for (int i = 1; i <=tick ; i++) {
              System.out.print("-");
          }
        System.out.println();
          pat(tick-1);
    }
}

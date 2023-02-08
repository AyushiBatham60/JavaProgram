package src.String;

public class addString {
    public static String addStrings(String num1, String num2) {
        int p1=num1.length()-1;
        int p2=num2.length()-1;
        String ans="";
        int carry=0;
        while(p1>=0 && p2>=0){
            int sum=Integer.parseInt(""+num1.charAt(p1))+Integer.parseInt(""+num2.charAt(p2))+carry;
            carry=sum/10;
            ans=(sum%10)+ans;
            p1--;
            p2--;
        }
        while(p1>=0){
            int sum=carry+Integer.parseInt(""+num1.charAt(p1));
            p1--;
            carry=sum/10;
            ans=(sum%10)+ans;
        }
        while(p2>=0){
            int sum=carry+Integer.parseInt(""+num2.charAt(p2));
            p2--;
            carry=sum/10;
            ans=(sum%10)+ans;
        }
        if(carry!=0)
            ans=carry+ans;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(addStrings("12","93"));
    }
}

package src.Recursion;

public class paranthesis {
    //print valid paranthesis if n i.e 2*n brackets are present n open and n closed

    public static void main(String[] args) {
        paranthesis(3,0,0,false,false,"");
    }
    public static void paranthesis(int n,int openBracket,int closedBracket,boolean isopen,boolean isclosed,String res){
        if(openBracket==n && closedBracket==n){
            System.out.println(res);
            return;
        }
        if(openBracket>n || closedBracket>n || openBracket<closedBracket){
            return;
        }

        paranthesis(n,openBracket+1,closedBracket,true,false,res+'(');
        paranthesis(n, openBracket, closedBracket + 1, false, true, res + ")");

    }
}

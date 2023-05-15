package src.oops;


abstract class exp{
    public  exp(){
        System.out.println("inside exp");
    }
}
public class concepts extends exp{
    concepts(){
        super();
    }
    static int c=0;
    public void chenge(){
        c++;
        
    }
    public static void main(String[] args) {
        concepts obj=new concepts();
        obj.chenge();
        System.out.println(c);
    }
}

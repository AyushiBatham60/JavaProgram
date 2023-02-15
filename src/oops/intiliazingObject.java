package src.oops;

public class intiliazingObject {
    //intialize object through refernce;
    int id;
    String name;
    //through constaructor
    intiliazingObject(){

    }
    intiliazingObject(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void  initial(int id,String name){
        this.id=id;
        this.name=name;
    }

}
 class create{

     public static void main(String[] args) {
         //through refernce
         intiliazingObject ob1=new intiliazingObject();
         ob1.id=1;
         ob1.name="ayushi";
         System.out.println(ob1.id+" "+ob1.name);
         //through method
         intiliazingObject ob2=new intiliazingObject();
         ob2.initial(2,"batham");
         System.out.println(ob2.id+" "+ob2.name);


         intiliazingObject ob3=new intiliazingObject(3,"ax");
         System.out.println(ob3.id+" "+ob3.name);
     }
}

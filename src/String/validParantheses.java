package src.String;

import java.util.Stack;

public class validParantheses {
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        String exp=s;
        st.push(exp.charAt(0));
        int i=1;
        while (i<exp.length()  ){

            char chr=exp.charAt(i);
            if(!st.isEmpty() &&st.peek()=='('  && exp.charAt(i)==')'){
                st.pop();

            }
            else  if(!st.isEmpty() &&st.peek()=='[' && chr==']'){
                st.pop();
            }
            else if(!st.isEmpty() &&st.peek()=='{' && chr=='}'){
                st.pop();
            }
            else {
                st.push(exp.charAt(i));
            }
            i++;
        }
        if(st.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}

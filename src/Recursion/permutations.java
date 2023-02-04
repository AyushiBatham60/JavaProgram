package src.Recursion;

public class permutations {

    public static void main(String[] args) {
        form_permutation("abc","");
    }
    public static void form_permutation(String s,String res){
        if(s.isEmpty()){
            System.out.println(res);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String remSubstring=s.substring(0,i)+s.substring(i+1);
            form_permutation(remSubstring,res+ch);
        }
    }
}

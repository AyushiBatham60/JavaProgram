package src.String;

import java.util.Scanner;

public class camelCase {

    //One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code,
    // developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case.
    // FindAllTheWordsContainedInIt.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printAllWord(sc.next());
    }
    public static void printAllWord(String s){
        String temp=""+s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            int ascii=(int)s.charAt(i);
            if(ascii>=97 && ascii<=123){
                temp+=s.charAt(i);
            }
            else {
                System.out.println(temp);
                temp="";
                temp+=s.charAt(i);
            }
        }
        System.out.println(temp);
    }
}

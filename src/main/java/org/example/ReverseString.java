package org.example;

public class ReverseString {
    public static void main(String[] args){
        String s = "Madam";
        String s1 = "";
        for(int i = s.length()-1; i>=0 ; i--){
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);

        String sb = new StringBuilder(s).reverse().toString();
        System.out.println(sb);
    }
}



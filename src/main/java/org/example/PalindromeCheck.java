package org.example;

public class PalindromeCheck {
    //Test with  - hello, level, a, "" (empty)

    public static void main(String[] args){
        String s = "";
        String lowerCase = s.toLowerCase();
        String reverse = new StringBuilder(lowerCase).reverse().toString();
        if (lowerCase.equals(reverse))
        {
            System.out.println("its palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

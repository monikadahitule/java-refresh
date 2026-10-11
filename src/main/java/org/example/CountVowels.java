package org.example;

public class CountVowels {
    public static void main(String[] args){
        String sentence = "AEIOU"; //banana // AEIOU //Automation Testing
        String lowerCaseString = sentence.replace(" ","").toLowerCase();
        int count = 0;
        for(int i=0;i<=lowerCaseString.length()-1;i++) {
            char c = lowerCaseString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

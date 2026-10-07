package org.example;

public class ReverseNum {
    //check edge cases when num is negative and num is too longS
    public static void main(String[] args){
        int num = 1234; //5,100,0, 1234
        int newNum = 0;
        while (num > 0){
            newNum = (newNum*10) + (num%10);
            num = num/10;
        }
        System.out.println(newNum);
    }
}

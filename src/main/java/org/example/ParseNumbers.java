package org.example;

public class ParseNumbers {
    public static void main(String[] args) {
        String[] values  = {"10", "abc", "25", "", "7"};
        int sum = 0;

        for(String value : values){
            try {
                sum += Integer.parseInt(value);
            }
            catch (NumberFormatException e){
                System.out.println("Number format Exception for " +  e.getMessage());
            }
        }

            System.out.println("Done !! Sum =" + sum);
    }
}

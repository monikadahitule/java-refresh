package org.example;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 3, 3, 3, 4}; //{1,2,3};//{4, 1, 4, 2, 1};//{5, 5, 5}; //
        for (int i = 0; i < num.length; i++) {
            boolean isSeen = false;
            for (int j = 0; j < i; j++) {
                if (num[j] == num[i]) {
                    isSeen = true;
                    break;
                }
            }
            if (!isSeen) {
                System.out.print(num[i]+" ");
            }
        }
    }
}

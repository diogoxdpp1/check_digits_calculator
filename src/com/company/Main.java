package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your digits");
        String number = input.next();
        int[] numArray = new int[13];
        for (int i = 0; i < number.length(); i++) {
            numArray[i] = Integer.parseInt(number.charAt(i) + "");
        }
            int numberList1 = numArray[1] + numArray[3] + numArray[5] + numArray[7] + numArray[9] + numArray[11];
            int numberList2 = numArray[0] + numArray[2] + numArray[4] + numArray[6] + numArray[8] + numArray[10];
            int extranum = numArray[12];
            int numberListFinal = numberList1 * 3;
            int lastnum = numberListFinal + numberList2;
            int finalNum = lastnum + extranum;
        System.out.println(finalNum);
            int check = ((finalNum/10)+1)*10;
        System.out.println(check);
        if(check == finalNum + 10){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
    }
}

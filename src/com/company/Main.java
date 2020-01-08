package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a string to reverse: ");

        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}

package IfElse;

import java.util.Scanner;

public class WordPrint {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num = sc.nextInt();
        if (num ==1)
        {
            System.out.println("unit");
        } else if (num ==10) {
            System.out.println("Ten");
        }
           else if (num ==100) {
            System.out.println("Hundred");
        }
        if (num ==1000) {
            System.out.println("Thousand");
        }
        else
        {
            System.out.println("invalid");

    }}}



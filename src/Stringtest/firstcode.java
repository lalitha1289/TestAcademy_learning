package Stringtest;

import java.util.Scanner;

public class firstcode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input= sc.next();
        System.out.println(input);
        System.out.println("Length:"+" " +input.length());
        System.out.println("First char"+" "+input.charAt(0));
        input=input.trim();
        System.out.println("Substring"+" "+input.substring(5));



    }
}

package Stringtest;
import java.util.*;
public class secondname {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first input");
            String s1= sc.next();
            System.out.println("Enter the second input");
            String s2= sc.next();
            System.out.println("Enter the third input");
            String s3= sc.next();
            System.out.println("equals():"+" "+s1.equals(s2));
            System.out.println("equalsIgnoreCase():"+" "+s1.equalsIgnoreCase(s2));
            System.out.println("compareTo()"+" "+s1.compareTo(s2));
            System.out.println("== "+" "+s1==s2);



    }
}

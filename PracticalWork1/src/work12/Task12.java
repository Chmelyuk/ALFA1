package work12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[]args) {
       System.out.println ("Enter your name");
       Scanner sc = new Scanner(System.in);
       String phrase = sc.nextLine();
       System.out.println ("My name is");
       System.out.print (phrase);
    }
}

package work23;

import java.util.Scanner;

public class task23 {
    public static void main (String[] args) {
        System.out.println("Введи число");
        int a = new Scanner(System.in).nextInt();
        int b = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
        System.out.println("Твое число="+a);
        System.out.println("Реверс="+b);
        }
    }


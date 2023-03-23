package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* int x=5;
        while(x>0){
            System.out.println(x);
            x--;
        }
        System.out.println("loop ended");*/


        Scanner sc=new Scanner(System.in);
       boolean k=true;
        int num;
        int fact;
       while (k) {
           num = sc.nextInt();
           fact = 1;

           while (num > 0) {
               fact *= num;
               num -= 1;
           }
           System.out.println(fact);
       }
    }

}

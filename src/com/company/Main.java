package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Scanner scan = new Scanner(System.in);
            int testCase = scan.nextInt();

            for (int i=0;i<testCase;i++){
                int numOfDays = scan.nextInt();
                int expireDays = scan.nextInt();
                int eatInDay = scan.nextInt();

                if ((expireDays * eatInDay) >= numOfDays){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
    }
}

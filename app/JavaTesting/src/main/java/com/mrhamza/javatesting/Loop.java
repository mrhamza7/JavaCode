package com.mrhamza.javatesting;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num= sc.nextInt();
        System.out.println("The Table of "+ num +" is = ");
        for(int i=0;i<=10;i++)
        {
            System.out.println( num+" * "+ i+" ="+ num*i);
        }
    }
}

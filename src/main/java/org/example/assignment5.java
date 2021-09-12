/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment5 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("First Number: ");
        double firstNum = scan.nextDouble();

        System.out.print("Second Number: ");
        double secondNum = scan.nextDouble();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));


    }

}
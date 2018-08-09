package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c , d;

        //scanner class to get user input
        Scanner input = new Scanner(System.in);

        //getting first num from the user
        System.out.println("Enter first num to see prime num: ");
        c = input.nextInt();
        input.nextLine();

        //getting second number from the user
        System.out.println("Enter Second num to see prime num: ");
        d = input.nextInt();
        input.nextLine();

        //printing user entered data
        System.out.println("first num is "+c);
        System.out.println("Second num is: "+ d);

        System.out.println("The prime number between "+ c + " and " +d +" are:");

        //for loop to go through all the number between c and d and check if the number is prime or not
        for(int i =c ; i <=d ; i++) {

            if( isPrime(i)) {

                System.out.print(i  + " ");
            }
        }
        System.out.println(" ");
        int i = c;
        while(i <= d){

            if(isEven(i)){
                System.out.println(i+" is even number.");
            }
            else {
                System.out.println(i + " is odd number.");

            }            i++;
        }

    }

    //this methods checks all the number and return true for prime number and returns false for non prime numbers
    //public method-- static content-- boolean return type-- isPrime name of the method -- int n parameter of the method
    public static boolean isPrime(int n) {

        if(n <=1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i ++) {

            if(n %i ==0) {
                return false;
            }
        }

        return true;

    }

    //odd and even number test
    public static boolean isEven(int n){

        if(n <= 1){
            return false;
        }
        else if(n %2 !=0){
            return false;
        }
        return true;
    }

}


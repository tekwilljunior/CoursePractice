package HomeWork5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner checkNumber = new Scanner(System.in);
        System.out.println("Please enter a number to be checked ");
        double userPromted = checkNumber.nextDouble();


        /*
        if (userPromted % 2 == 0) {
            System.out.println("The number " + userPromted + " is even ");
        } else {
            System.out.println("The number " + userPromted + " you have entered is odd");


        }
    } */

        System.out.println("The number you have entered: " + userPromted + "  is:" + (userPromted % 2 == 0 ? " even" : "  odd"));
    }
}
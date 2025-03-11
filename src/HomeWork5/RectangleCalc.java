package HomeWork5;

import java.util.Scanner;

public class RectangleCalc {
    Scanner scanner = new Scanner(System.in);
    double area1;
    double area2;
    double width1;
    double width2;
    double length1;
    double length2;

    public static void main(String[] args) {
        RectangleCalc checkDiff = new RectangleCalc();
        checkDiff.CheckArea1();
        checkDiff.CheckArea2();
        checkDiff.DiffCheck();
    }

    public void CheckArea1() {
        System.out.println("Enter width of first rectangle ");
        width1 = scanner.nextDouble();
        System.out.println("Enter the length of first rectangle ");
        length1 = scanner.nextDouble();
        area1 = width1 * length1;
        System.out.println("The area of first rectangle is " + area1);
    }

    public void CheckArea2() {
        System.out.println("Enter width of second rectangle ");
        width2 = scanner.nextDouble();
        System.out.println("Enter the length of second rectangle ");
        length2 = scanner.nextDouble();
        area2 = width2 * length2;
        System.out.println("The area of first rectangle is " + area2);
    }

    public void DiffCheck() {
    /* if (area1 > area2) {
         System.out.println("First rectangle is bigger");
     } else if (area2 > area1) {
          System.out.println("Second rectangle is bigger");
     } else {-
         System.out.println("Both rectangles are even ");

*/
        System.out.println(area1 > area2 ? "First rectangle is bigger" : (area2 > area1 ? "Second rectangle is bigger" : "Both areas are even"));

    }

}





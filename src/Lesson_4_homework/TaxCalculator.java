package Lesson_4_homework;

public class TaxCalculator {
    double price = 3000.62;
    double tax = 76.03;
    int quantity = 9;
    double total = (price * quantity * tax);

    //constructor for TaxCalculator
    public TaxCalculator() {
        System.out.println("Total cost with tax is: " + total);
    }


}
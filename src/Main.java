import Optional_Homework.age_diff;
import greetings.append;
import greetings_1.append_1;
import HelloJavaWorld.greet_me;
import Lesson_4_homework.Variables;
import Lesson_4_homework.TaxCalculator;
class greetv {
    public static void main(String[] args) {
        greet_me hi_from_marin = new greet_me("Greetings", "suckers", "world");

        System.out.println(hi_from_marin.greet + " " + hi_from_marin.whom + " " + hi_from_marin.community);
//begin invoking class from package greetings
        append availables_1 = new append();
        availables_1.printMessage();

//begin invoking class from package greetings_1
        append_1 availables_2 = new append_1();
        availables_2.printMessage_1();
//homework_4 package Lesson_4_homework
        Variables display_homework_from_package = new Variables();
        TaxCalculator total_cost = new TaxCalculator();

        //invoke optional homework
        age_diff compareAge = new age_diff();
        compareAge.printAgeDiff(); //access package method via constructor


    }
}
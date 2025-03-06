import greetings.append;
import greetings_1.append_1;
import HelloJavaWorld.greet_me;
import Lesson_4_homework.Variables;
class greetv {
    public static void main(String[] args) {
        greet_me hi_from_marin = new greet_me("Greetings", "suckers", "world");

        System.out.println(hi_from_marin.greet + " " + hi_from_marin.whom + " " + hi_from_marin.community);

        append availables_1 = new append();
        availables_1.printMessage();


        append_1 availables_2 = new append_1();
        availables_2.printMessage_1();

        Variables display_homework_from_package = new Variables();

    }
}
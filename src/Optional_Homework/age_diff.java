package Optional_Homework;
import java.time.LocalDate;
public class age_diff {
    int birth_1 = 1995;
    int birth_2 = 2003;
    String name_1 = "Marin";
    String name_2 = "Irina";
    int age_1;
    int age_2;


    //begin constructor to manipulate instance variables
    public age_diff() {
        int current_year = LocalDate.now().getYear();
        this.age_1 = current_year - birth_1;
        this.age_2 = current_year - birth_2;

    }

    //method to calculate and output
    public void printAgeDiff() {
        System.out.println(name_1 + " is " + age_1 + " years old ");
        System.out.println(name_2 + " is " + age_2 + " years old ");
        System.out.println("The difference is " + (age_1 - age_2) + " years");
    }
}

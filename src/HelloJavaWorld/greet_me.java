package HelloJavaWorld;
//Define class as public to import later
public class greet_me {
    public String greet;
    public String whom;
    public String community;
 //Constructor_1
    public greet_me(String greet, String community, String whom){
        this.greet = greet;
        this.community = community;
        this.whom = whom;
    }
     //Default action with no modification
//Constructor_2 , modifying as requested in homework
   public  greet_me(){
        this.greet = "Hello";
        this.whom = "Java";
        this.community = "World";


    }
}
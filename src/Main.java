import HelloJavaWorld.greet_me;
class greetv {
    public static void main(String[] args) {
        greet_me hi_from_marin = new greet_me(/*"Greetings", "suckers", "world"*/);

        System.out.println(hi_from_marin.greet + " " + hi_from_marin.whom + " " + hi_from_marin.community);
    }
}
import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", randomElement(nouns), randomElement(adjectives));

    }// main

    public static String[] adjectives = {
            "attractive",
            "bald",
            "beautiful",
            "chubby",
            "clean",
            "dazzling",
            "drab",
            "elegant",
            "fancy",
            "fit"
    };

    public static String[] nouns = {
            "team",
            "band",
            "colony",
            "school",
            "village",
            "bunch",
            "flock",
            "squadron",
            "family",
            "swarm"
    };

    public static String randomElement(String[] array){
        int randomIndex = new Random().nextInt(array.length);
        return array[randomIndex];
    }

}// class

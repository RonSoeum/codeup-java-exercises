import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

//        String[] adjectives = new String[10];
//        adjectives[0] = "attractive";
//        adjectives[1] = "bald";
//        adjectives[2] = "beautiful";
//        adjectives[3] = "chubby";
//        adjectives[4] = "clean";
//        adjectives[5] = "dazzling";
//        adjectives[6] = "drab";
//        adjectives[7] = "elegant";
//        adjectives[8] = "fancy";
//        adjectives[9] = "fit";

//        String[] nouns = new String[10];
//        nouns[0] = "people";
//        nouns[1] = "band";
//        nouns[2] = "colony";
//        nouns[3] = "school";
//        nouns[4] = "village";
//        nouns[5] = "bunch";
//        nouns[6] = "flock";
//        nouns[7] = "squadron";
//        nouns[8] = "family";
//        nouns[9] = "swarm";

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

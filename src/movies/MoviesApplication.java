package movies;
import util.Input;
import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {

        userOptions();
        userChoice();

    }// main

    static Input input = new Input();

    public static void userOptions() {
        System.out.println("what would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category\n");
    }// userOptions

    public static void userChoice(){
        int userInput = input.getInt(0, 5, "Enter your choice");
        if(userInput == 0){
            System.exit(0);// 0
        }
        if(userInput == 1){
            System.out.println(allMovies());// 1
            System.out.println();
            System.out.println();
        }
        if(userInput == 2){
            System.out.println(animatedMovies());// 2
            System.out.println();
            System.out.println();
        }
        if(userInput == 3){
            System.out.println(dramaMovies());// 3
            System.out.println();
            System.out.println();
        }
        if(userInput == 4){
            System.out.println(horrorMovies());// 4
            System.out.println();
            System.out.println();
        }
        if(userInput == 5){
            System.out.println(scifiMovies());// 5
            System.out.println();
            System.out.println();
        }
        userOptions();
        userChoice();
    }// userChoice

    public static String allMovies(){
        String allMovies = "";
        for(Movie movie: findAll()){
            allMovies = allMovies + "\n" + movie.getMovieName();
        }
        return allMovies;
    }

    public static String animatedMovies(){
        String animatedMovies = "";
        for(Movie movie: findAll()){
            if(movie.getMovieCategory() == "animated"){
                animatedMovies = animatedMovies + "\n" + movie.getMovieName();
            }
        }
        return animatedMovies;
    }

    public static String dramaMovies(){
        String dramaMovies = "";
        for(Movie movie: findAll()){
            if(movie.getMovieCategory() == "drama"){
                dramaMovies = dramaMovies + "\n" + movie.getMovieName();
            }
        }
        return dramaMovies;
    }

    public static String horrorMovies(){
        String horrorMovies = "";
        for(Movie movie: findAll()){
            if(movie.getMovieCategory() == "horror"){
                horrorMovies = horrorMovies + "\n" + movie.getMovieName();
            }
        }
        return horrorMovies;
    }

    public static String scifiMovies(){
        String scifiMovies = "";
        for(Movie movie: findAll()){
            if(movie.getMovieCategory() == "scifi"){
                scifiMovies = scifiMovies + "\n" + movie.getMovieName();
            }
        }
        return scifiMovies;
    }

}// class

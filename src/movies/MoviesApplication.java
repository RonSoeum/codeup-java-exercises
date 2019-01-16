package movies;
import util.Input;

import java.util.Arrays;

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
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - add a new movie to the list\n");
    }// userOptions

    public static void userChoice(){
        int userInput = input.getInt(0, 6, "Enter your choice");
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
        if(userInput == 6){
            addMovie();
            System.out.println();
            System.out.println();
        }
        userOptions();
        userChoice();
    }// userChoice

    public static Movie[] moviesArray = findAll().clone();

    public static String allMovies(){
        String allMovies = "";
        for(Movie movie: moviesArray){
            allMovies = allMovies + "\n" + movie.getMovieName();
        }
        return allMovies;
    }

    public static String animatedMovies(){
        String animatedMovies = "";
        for(Movie movie: moviesArray){
            if(movie.getMovieCategory().equalsIgnoreCase("animated")){
                animatedMovies = animatedMovies + "\n" + movie.getMovieName();
            }
        }
        return animatedMovies;
    }

    public static String dramaMovies(){
        String dramaMovies = "";
        for(Movie movie: moviesArray){
            if(movie.getMovieCategory().equalsIgnoreCase("drama")){
                dramaMovies = dramaMovies + "\n" + movie.getMovieName();
            }
        }
        return dramaMovies;
    }

    public static String horrorMovies(){
        String horrorMovies = "";
        for(Movie movie: moviesArray){
            if(movie.getMovieCategory().equalsIgnoreCase("horror")){
                horrorMovies = horrorMovies + "\n" + movie.getMovieName();
            }
        }
        return horrorMovies;
    }

    public static String scifiMovies(){
        String scifiMovies = "";
        for(Movie movie: moviesArray){
            if(movie.getMovieCategory().equalsIgnoreCase("scifi")){
                scifiMovies = scifiMovies + "\n" + movie.getMovieName();
            }
        }
        return scifiMovies;
    }

    public static void addMovie(){
        Movie[] newMoviesArray = Arrays.copyOf(moviesArray, moviesArray.length + 1);
        String name = input.getString("Enter movie name:");
        String category = input.getString("Enter movie category:");
        newMoviesArray[newMoviesArray.length - 1] = new Movie(name, category);
        moviesArray = newMoviesArray;
    }

}// class
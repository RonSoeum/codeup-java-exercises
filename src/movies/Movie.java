package movies;

public class Movie {

    private String name;
    private String category;

    // constructor
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    // getter
    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }

    // setter
    public void setMovieName(String name){
        this.name = name;
    }

    public void setMovieCategory(String name){
        this.category = category;
    }

}// class

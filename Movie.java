
import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration; // in minutes


    // setter and getter
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    // constructer
    public Movie(){

    }
    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }


    // Methods
    public void watch(User user){
     //Allows users to watch the movie by adding the movie to the purchased list
       user.addPurchasedMedia(this);
    }


     public ArrayList<Movie> recommendSimilarMovies( List<Movie>movieCatalog ){
         ArrayList<Movie> recoMovie =new ArrayList<>();
         for ( Movie m : movieCatalog){
             if (m.getAuteur().equals(getAuteur())){
                 recoMovie.add(m);
             }
         } return recoMovie;
     }

      @Override
      public String getMediaType() {
         if (duration >= 120 ){
         return "Long Movie";}
         else {
             return  "Movie";
        }
    }


    @Override
    public String toString() {
        return super.toString()+" duration "+duration+" in a minutes ";
    }
}

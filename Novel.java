import java.util.ArrayList;

public class Novel extends Book{

     private  String genre;

     // setter , getter
     public String getGenre() {
        return genre;
     }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Constructers
    public Novel(){

    }
    public Novel(String genre) {
        this.genre = genre;
    }


    public Novel(int stock, ArrayList<Review> reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock,  String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        if (getAvrageRating() >= 4.5){
        return "Bestselling Novel"; }
        else {
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return super.toString()+" genre "+ genre;
    }
}

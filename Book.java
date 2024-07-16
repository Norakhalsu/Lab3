//import javax.xml.transform.Source;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book extends Media{

    private int stock;
    private static List<Review> reviews;


    // costructers
    public Book(){
    }
    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }
    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    //getter and setter
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public List<Review> getReviews() {
        return reviews;
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }


     // Methods
    public static void addReview(Review review ){
        // Adds a review to the book's list
        reviews.add(review);
   }

   public static double getAvrageRating(){
       // Calculates and returns the average rating.
       double sum=0;
       for (Review rev : reviews) {
           sum += rev.getRating();
           double ave=sum/reviews.size();
           return  ave;
       }
        if (reviews.isEmpty()){
            return 0.0;
       }
       return 0;
   }


   public void purchese(User user){
      // Allows users to add the book to the purchased list
       user.addPurchasedMedia(this);
      // stock--;
   }

   public  boolean isBestseller(){
       return getAvrageRating() >= 4.5;
   }

    public void restock(int quantity){
          this.stock += quantity;
        System.out.println(" Restock Storge "+quantity);

    }



    @Override
    public String getMediaType() {
       // return super.getMediaType();
        if (isBestseller()){
            return "Bestselling Book";}
        else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return super.toString()+" stock "+ stock+" Avarge Rating "+getAvrageRating();
    }
}



public class Review {

     public double rating;
     private String username;
     private String comment;


     // setter , getter
     public double getRating() {
          return rating;
     }

     public void setRating(double rating) {
          this.rating = rating;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getComment() {
          return comment;
     }

     public void setComment(String comment) {
          this.comment = comment;
     }

     // Constructors
     public Review(){

     }
     public Review(double rating, String username, String comment) {
          this.rating = rating;
          this.username = username;
          this.comment = comment;
     }
}

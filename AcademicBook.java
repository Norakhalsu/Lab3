import java.util.ArrayList;

public class AcademicBook extends Book {

    private String subject;

    // Setter , getter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Constructers
    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(int stock, ArrayList<Review> reviews, String subject) {
        super(stock, reviews);
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

     // Methods
    @Override
    public String getMediaType() {
        if (getAvrageRating() >= 4.5) {
            return "Bestselling AcademicBook";
        } else {
            return "AcademicBook";
        }
    }

        @Override
        public String toString () {
            return super.toString() +" subject is: "+ subject;
        }

}
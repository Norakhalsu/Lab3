import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
                       Store store = new Store();
                     Media mededia1=new Media(" Leo" , "Majd", "7365" , 78 );
                   User user1 = new User("Sami_8576", "Sami@hotmail.com");
                 Book book1 = new Book("rabit fast ", "D.Raed ", "85636", 10.563, 10);
               Novel novel1 = new Novel("Styling", "Dr.Khaled ", "980003", 8.5, 9, "fashoin");
             AcademicBook academicBook1 = new AcademicBook(" Flyying ", "Howkenz", "9363423", 7.0, 14, "math");
           Movie movie1 = new Movie("frists", "jen", "9955", 5.5, 100);
         Music music1 = new Music("Bohemian ", "Prince", "ISBN45", 1.21, "prince");
        store.addMedia(academicBook1);
          store.addMedia(movie1);
             store.addMedia(book1);
                store.addMedia(novel1);
                  store.addMedia(music1);
                   store.addUser(user1);
                     user1.addToCart(book1);
                       user1.addToCart(movie1);
                         book1.purchese(user1);
                           user1.checkout();
                              user1.addToCart(movie1);
                               // user1.addPurchasedMedia(mededia1);

               // book1.addReview(new Review(4, "Abdullah ", " full information "));
                store.displayMedias();
                store.displayUser();
                //store.serachBook();
            }
        }


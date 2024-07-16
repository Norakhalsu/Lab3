
import java.util.ArrayList;

public class Store {

    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Media> medias = new ArrayList<Media>();


    /// Constructers
    public Store() {

    }

    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    // Setter ans Getter
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }


    // Methods
    public void addUser(User user) {
        //Adds a user to the list of users.
        users.add(user);
    }

    public ArrayList<User> displayUser() {
        // Displays a list of registered users.
        System.out.println(" registered users: ");
        for (User r : users) {
            System.out.println(" Usernaame "+r.getUsername() + " email: " + r.getEmail());
        } return users;
    }

    public void addMedia(Media media) {
        //Adds a media to the list of medias.
        medias.add(media);
    }

    public ArrayList<Media> displayMedias() {
        // Displays a list of Available media
        System.out.println(" display Media:");
        for (Media m : medias) {
            System.out.println(m);
        } return medias;
     }


    public Book serachBook(String title) {
        // Searches for a book by title and returns it if found
        for (Media med : medias) {
            if (med instanceof Book && med.getTitle().equalsIgnoreCase(title)) {
                return (Book) med;
            }
        }
        return null;
    }


}
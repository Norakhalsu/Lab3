import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<Media> purcheseMediaList;
    private ArrayList<Media> shoppingCart;


    // Constructers
    public User(){
        this.shoppingCart = new ArrayList<>();
        this.purcheseMediaList = new ArrayList<>();
    }

    public User(String username, String email) {
        this.username=username;
        this.email=email;
    }

    public User(String username, String email, ArrayList<Media> purcheseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purcheseMediaList = purcheseMediaList;
        this.shoppingCart = shoppingCart;
    }
    // Setter , Getter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurcheseMediaList() {
        return purcheseMediaList;
    }

    public void setPurcheseMediaList(ArrayList<Media> purcheseMediaList) {
        this.purcheseMediaList = purcheseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


       // Methods
    public void addToCart(Media media) {
        // Adds media to the user's shopping cart
        if (this.shoppingCart == null) {
            this.shoppingCart = new ArrayList<>();
        }
        this.shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        // Removes media from the shopping cart
        this.shoppingCart.remove(media);
    }

    public void checkout() {
        // Completes the purchase and updates purchased media list and stock
        for (Media media : this.purcheseMediaList) {

        }
    }
       public void addPurchasedMedia(Media media) {
        if (this.purcheseMediaList == null ){
            this.purcheseMediaList=new ArrayList<>();
        }
         this.purcheseMediaList.add(media);}


     }

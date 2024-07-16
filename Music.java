import java.util.*;

public class Music extends Media {


    private String artist;

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }


    // Methods:
    public void listen(User user) {
        // Allows users to listen to music
        user.addPurchasedMedia(this);
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        // Generates a playlist of similar songs based on the artist (auteur).
        List<Music> similarsongs  = new ArrayList<>();
        for (Music simi : musicCatalog) {
            if (simi.getArtist().equals(getArtist())) {
                similarsongs.add(simi);
            }
        }
        return similarsongs;
    }

    @Override
    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Artist: "
                + artist;   }


    }
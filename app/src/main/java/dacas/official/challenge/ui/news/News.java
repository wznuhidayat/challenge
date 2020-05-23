package dacas.official.challenge.ui.news;

public class News {
    private String title;
    private String author;
    private String image;
    public News(String title, String author, String image){
        this.title = title;
        this.author = author;
        this.image = image;
    }

    public News() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

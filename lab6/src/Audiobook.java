
public class Audiobook extends Base {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private double duration;
    private double price;
    private String format;


    public Audiobook() {
        super(0, "Unknown");
    }


    public Audiobook(int id, String title, String author, String publisher, int year, double duration, double price, String format) {
        super(id, title);
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.duration = duration;
        this.price = price;
        this.format = format;
    }


    public Audiobook(Audiobook other) {
        super(other.getId(), other.getTitle());
        this.author = other.author;
        this.publisher = other.publisher;
        this.year = other.year;
        this.duration = other.duration;
        this.price = other.price;
        this.format = other.format;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audiobook Info: ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author +
                ", Publisher: " + publisher + ", Year: " + year + ", Duration: " + duration + " hours" +
                ", Price: " + price + ", Format: " + format);
    }


    @Override
    public String toString() {
        return "Audiobook{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", price=" + price +
                ", format='" + format + '\'' +
                '}';
    }
}

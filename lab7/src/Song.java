public class Song extends Base implements Comparable<Song> {
    private String artist;
    private String album;
    private String genre;
    private String lyricist;
    private String language;
    private int releaseYear;
    private double duration;

    public Song() {
        super(0, "Unknown");
        this.artist = "Unknown";
        this.album = "Unknown";
        this.genre = "Unknown";
        this.lyricist = "Unknown";
        this.language = "Unknown";
        this.releaseYear = 0;
        this.duration = 0.0;
    }

    public Song(int id, String title, String artist, String album, String genre,
                String lyricist, String language, int releaseYear, double duration) {
        super(id, title);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.lyricist = lyricist;
        this.language = language;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public Song(Song other) {
        super(other.getId(), other.getTitle());
        this.artist = other.artist;
        this.album = other.album;
        this.genre = other.genre;
        this.lyricist = other.lyricist;
        this.language = other.language;
        this.releaseYear = other.releaseYear;
        this.duration = other.duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Song Info: ID: " + getId() + ", Title: " + getTitle() + ", Artist: " + artist +
                ", Album: " + album + ", Genre: " + genre + ", Lyricist: " + lyricist +
                ", Language: " + language + ", Release Year: " + releaseYear + ", Duration: " + duration + " minutes");
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", lyricist='" + lyricist + '\'' +
                ", language='" + language + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                '}';
    }

    @Override
    public int compareTo(Song other) {
        return this.artist.compareToIgnoreCase(other.artist);
    }
}

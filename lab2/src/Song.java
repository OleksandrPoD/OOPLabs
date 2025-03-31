public class Song {
    private int id;
    private String title;
    private String artist;
    private String album;
    private String genre;
    private String lyricist;
    private String language;
    private int releaseYear;
    private double duration;

    public Song(int id, String title, String artist, String album, String genre,
                String lyricist, String language, int releaseYear, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.lyricist = lyricist;
        this.language = language;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", lyricist='" + lyricist + '\'' +
                ", language='" + language + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                '}';
    }
}

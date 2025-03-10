public class Main {
    private static Song[] songs;

    public static void main(String[] args) {
        songs = new Song[]{
                new Song(1, "Song A", "Artist 1", "Album X", "Rock", "Lyricist A", "English", 2010, 3.5),
                new Song(2, "Song B", "Artist 2", "Album Y", "Pop", "Lyricist B", "English", 2015, 4.0),
                new Song(3, "Song C", "Artist 1", "Album Z", "Jazz", "Lyricist C", "French", 2005, 5.2),
                new Song(4, "Song D", "Artist 3", "Album W", "Rock", "Lyricist D", "Spanish", 2018, 3.8),
                new Song(5, "Song E", "Artist 2", "Album V", "Pop", "Lyricist E", "English", 2012, 4.5)
        };

        System.out.println("Songs by Artist 1:");
        printSongsByArtist("Artist 1");

        System.out.println("\nSongs of genre Pop:");
        printSongsByGenre("Pop");

        System.out.println("\nSongs released between 2000 and 2015:");
        printSongsByYearRange(2000, 2015);
    }

    private static void printSongsByArtist(String artist) {
        for (Song song : songs) {
            if (song.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(song);
            }
        }
    }

    private static void printSongsByGenre(String genre) {
        for (Song song : songs) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(song);
            }
        }
    }

    private static void printSongsByYearRange(int startYear, int endYear) {
        for (Song song : songs) {
            if (song.getReleaseYear() >= startYear && song.getReleaseYear() <= endYear) {
                System.out.println(song);
            }
        }
    }
}

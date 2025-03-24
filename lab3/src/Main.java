public class Main {
    private static Song[] songs;

    public static void main(String[] args) {
        songs = new Song[]{
                new Song(Integer.valueOf(1), "Song A", "Artist 1", "Album X", "Rock", "Lyricist A", "English", Integer.valueOf(2010), Double.valueOf(3.5)),
                new Song(Integer.valueOf(2), "Song B", "Artist 2", "Album Y", "Pop", "Lyricist B", "English", Integer.valueOf(2015), Double.valueOf(4.0)),
                new Song(Integer.valueOf(3), "Song C", "Artist 1", "Album Z", "Jazz", "Lyricist C", "French", Integer.valueOf(2005), Double.valueOf(5.2)),
                new Song(Integer.valueOf(4), "Song D", "Artist 3", "Album W", "Rock", "Lyricist D", "Spanish", Integer.valueOf(2018), Double.valueOf(3.8)),
                new Song(Integer.valueOf(5), "Song E", "Artist 2", "Album V", "Pop", "Lyricist E", "English", Integer.valueOf(2012), Double.valueOf(4.5))
        };

        System.out.println("Songs by Artist 1:");
        printSongsByArtist("Artist 1");

        System.out.println("\nSongs of genre Pop:");
        printSongsByGenre("Pop");

        System.out.println("\nSongs released between 2000 and 2015:");
        printSongsByYearRange(Integer.valueOf(2000), Integer.valueOf(2015));
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

    private static void printSongsByYearRange(Integer startYear, Integer endYear) {
        for (Song song : songs) {
            if (song.getReleaseYear().compareTo(startYear) >= 0 && song.getReleaseYear().compareTo(endYear) <= 0) {
                System.out.println(song);
            }
        }
    }
}

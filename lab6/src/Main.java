import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Song> songs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Base[] items = new Base[4];

        items[0] = new Song(1, "Song A", "Artist 1", "Album X", "Rock", "Lyricist A", "English", 2010, 3.5);
        items[1] = new Audiobook(1, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 1997, 8.5, 15.99, "MP3");
        items[2] = new Song(2, "Song B", "Artist 2", "Album Y", "Pop", "Lyricist B", "English", 2015, 4.0);
        items[3] = new Audiobook(2, "1984", "George Orwell", "Secker & Warburg", 1949, 9.0, 12.99, "WAV");

        for (Base item : items) {
            item.displayInfo();
        }

        System.out.println("===== Конструктори =====");

        Song song1 = new Song();
        System.out.println(song1);

        Song song2 = new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock",
                "Freddie Mercury", "English", 1975, 5.55);
        System.out.println(song2);

        Song song3 = new Song("Shape of You", "Ed Sheeran", "Divide", "Pop");
        System.out.println(song3);

        Song song4 = new Song("Smells Like Teen Spirit", "Nirvana");
        System.out.println(song4);

        Song song5 = new Song(song2);
        System.out.println(song5);

        songs.add(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock",
                "Freddie Mercury", "English", 1975, 5.55));
        songs.add(new Song(2, "Shape of You", "Ed Sheeran", "Divide", "Pop",
                "Ed Sheeran", "English", 2017, 3.53));
        songs.add(new Song(3, "Smells Like Teen Spirit", "Nirvana", "Nevermind", "Rock",
                "Kurt Cobain", "English", 1991, 5.01));
        songs.add(new Song(4, "Bad Guy", "Billie Eilish", "When We All Fall Asleep", "Pop",
                "Billie Eilish", "English", 2019, 3.14));
        songs.add(new Song(5, "Nothing Else Matters", "Metallica", "Metallica", "Metal",
                "James Hetfield", "English", 1991, 6.29));

        // Фільтрація за жанром
        System.out.println("\nФільтрація за жанром (введіть жанр):");
        filterByGenre();

        System.out.println("\nФільтрація за жанром Rock:");
        filterByGenre("Rock");
    }

    public static void filterByGenre(String genre) {
        System.out.println("Пісні у жанрі " + genre + ":");
        for (Song song : songs) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(song);
            }
        }
    }

    public static void filterByGenre() {
        System.out.print("Введіть жанр для фільтрації: ");
        String genre = scanner.nextLine();  // Очікує введення користувача
        filterByGenre(genre);
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song[] songs = new Song[] {
                new Song(1, "Imagine", "John Lennon", "Imagine", "Rock", "John", "English", 1971, 3.1),
                new Song(2, "Shallow", "Lady Gaga", "A Star Is Born", "Pop", "Gaga", "English", 2018, 3.5),
                new Song(3, "Numb", "Linkin Park", "Meteora", "Rock", "Bennington", "English", 2003, 3.0),
                new Song(4, "Bad Guy", "Billie Eilish", "When We All Fall Asleep", "Pop", "Billie", "English", 2019, 3.2),
                new Song(5, "Lose Yourself", "Eminem", "8 Mile", "Rap", "Eminem", "English", 2002, 5.2)
        };

        Audiobook[] audiobooks = new Audiobook[] {
                new Audiobook(1, "1984", "George Orwell", "Secker & Warburg", 1949, 10.0, 15.0, "MP3"),
                new Audiobook(2, "Harry Potter 1", "J.K. Rowling", "Bloomsbury", 1997, 8.5, 12.0, "MP3"),
                new Audiobook(3, "The Hobbit", "J.R.R. Tolkien", "Allen & Unwin", 1937, 9.0, 13.5, "WAV"),
                new Audiobook(4, "Fahrenheit 451", "Ray Bradbury", "Ballantine Books", 1953, 7.0, 11.0, "WAV"),
                new Audiobook(5, "Frankenstein", "Mary Shelley", "Lackington", 1818, 8.0, 10.5, "WAV")
        };

        System.out.println("Сортування за artist / author (Comparable):");
        Arrays.sort(songs);
        Arrays.sort(audiobooks);
        for (Song s : songs) System.out.println(s);
        for (Audiobook a : audiobooks) System.out.println(a);

        System.out.println("\nСортування за жанром і назвою / автором і назвою (Comparator):");
        Arrays.sort(songs, (s1, s2) -> {
            int genreCmp = s1.getGenre().compareToIgnoreCase(s2.getGenre());
            if (genreCmp != 0) return genreCmp;
            return s1.getTitle().compareToIgnoreCase(s2.getTitle());
        });

        Arrays.sort(audiobooks, (a1, a2) -> {
            int authorCmp = a1.getAuthor().compareToIgnoreCase(a2.getAuthor());
            if (authorCmp != 0) return authorCmp;
            return a1.getTitle().compareToIgnoreCase(a2.getTitle());
        });

        for (Song s : songs) System.out.println(s);
        for (Audiobook a : audiobooks) System.out.println(a);
    }
}

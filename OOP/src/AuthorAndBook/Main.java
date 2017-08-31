package AuthorAndBook;

public class Main {
    public static void main(String[] args) {
        Author tomasNore = new Author("Tomas Nore", "tomas.nore@gmail.com",'m');
        System.out.println(tomasNore);

        Book bookNight = new Book("Night",tomasNore,23.99,90);
        System.out.println(bookNight);

        //CO GDY BEDZIE WIECEJ AUTORÓW
    }
}

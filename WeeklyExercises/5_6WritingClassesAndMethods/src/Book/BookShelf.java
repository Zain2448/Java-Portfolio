package Book;

public class BookShelf
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Iron man", "Tony Stark", "Marvel", 1999);
        Book book2 = new Book("Hulk", "Bruce Banner", "Marvel", 1970);
        Book book3 = new Book("Captain America", "Steve Rogers", "Marvel", 1950);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        book1.setAuthor("Stan Lee");
        book2.setAuthor("Stan Pee");
        book3.setAuthor("Stan Mee");

        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
        System.out.println(book3.getAuthor());

    }
}

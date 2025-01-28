package Book;

public class Book
{
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    Book(String title, String author, String publisher, int copyrightDate)
    {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setCopyrightDate(copyrightDate);
    }

    public String getTitle()
    {
        return  title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public int getCopyrightDate()
    {
        return copyrightDate;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public void setCopyrightDate(int copyrightDate)
    {
        this.copyrightDate = copyrightDate;
    }


    public String toString()
    {
        return  "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publisher: " + publisher + "\n" +
                "Copyright Date: " + copyrightDate + "\n";
    }
}

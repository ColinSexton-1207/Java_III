package val;

import java.util.Date;

public class Chapter extends Book {
    private String editorName;
    private String bookTitle;
    private String pages;

    // Constructor
    public Chapter(String author, String title, Date pubDate, String publisher, String city, String state, String country,
                   String editorName, String bookTitle, String pages) {
        super(author, title, pubDate, publisher, city, state, country);
        this.editorName = editorName;
        this.bookTitle = bookTitle;
        this.pages = pages;
    }

    // Setter Methods
    public void setEditor(String editorName) { this.editorName = editorName; }
    public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }
    public void setPages(String pages) { this.pages = pages; }

    // Getter Methods
    public String getEditor() { return editorName; }
    public String getBookTitle() { return bookTitle; }
    public String getPages() { return pages; }

    // Format Methods - Will return a string of each citation style for journals
    @Override
    public String formatMLA() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + ". " + this.getTitle() + ". " + this.getBookTitle() + ", " + this.getEditor() + ", "
                + this.getPublisher() + ", " + this.getDate() + ", " + this.getPages() + ".");
    }

    @Override
    public String formatAPA() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + ". (" + this.getDate() + "). " + this.getTitle() + ". " + this.getEditor() + ". "
                + this.getBookTitle() + ". " + this.getPublisher() + ". " + this.getPages() + ".");
    }

    @Override
    public String formatChicago() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + ". " + this.getTitle() + ". In " + this.getBookTitle() + ", " + this.getPages() + ". "
                + this.getCity() + ": " + this.getPublisher() + ", " + this.getDate() + ".");
    }
}

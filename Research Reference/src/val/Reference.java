package val;

import java.util.Date;

public abstract class Reference implements FormattableReference {
    private String author;
    private String title;
    private Date pubDate;

    // Constructor
    public Reference(String author, String title, Date date) {
        this.author = author;
        this.title = title;
        this.pubDate = date;
    }

    // Setter Methods
    public void setAuthor(String author) { this.author = author; }
    public void setTitle(String title) { this.title = title; }
    public void setDate(Date date) { this.pubDate = date; }

    // Getter Methods
    public String getAuthor() { return author; }
    public String getTitle() { return title; }
    public Date getDate() { return pubDate; }

    // Format Methods
    @Override
    public String formatMLA() throws Error {
        throw new Error("Unsupported Operation Exception - Not supported!");
    }

    @Override
    public String formatAPA() throws Error {
        throw new Error("Unsupported Operation Exception - Not supported!");
    }

    @Override
    public String formatChicago() throws Error {
        throw new Error("Unsupported Operation Exception - Not supported!");
    }
}

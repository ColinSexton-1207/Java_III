package val;

import java.util.Date;

public class Book extends Reference {
    private String publisher;
    private String city;
    private String state;
    private String country;

    // Constructor
    public Book(String author, String title, Date pubDate, String publisher, String city, String state, String country) {
        super(author, title, pubDate);
        this.publisher = publisher;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Setter Methods
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setCountry(String country) { this.country = country; }

    // Getter Methods
    public String getPublisher() { return publisher; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getCountry() { return country; }

    // Format Methods - Will return a string of each citation style for journals
    @Override
    public String formatMLA() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + ". " + this.getTitle() + ". " + this.getPublisher() + ", " + this.getDate() + ".");
    }

    @Override
    public String formatAPA() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + ". (" + this.getDate() + "). " + this.getTitle() + ". " + this.getPublisher() + ".");
    }

    @Override
    public String formatChicago() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + ". " + this.getTitle() + ": " + this.getPublisher() + ", " + this.getDate() + ".");
    }
}

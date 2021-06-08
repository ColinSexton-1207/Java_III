package val;

import java.util.Date;

public class Journal extends Reference {
    private String source;
    private int volume;
    private int number;
    private String pages;

    // Constructor
    public Journal(String author, String title, Date pubDate, String source, int volume, int number, String pages) {
        super(author, title, pubDate);
        this.source = source;
        this.volume = volume;
        this.number = number;
        this.pages = pages;
    }

    // Setter Methods
    public void setSource(String source) { this.source = source; }
    public void setVolume(int volume) { this.volume = volume; }
    public void setNumber(int number) { this.number = number; }
    public void setPages(String pages) { this.pages = pages; }

    // Getter Methods
    public String getSource() { return source; }
    public int getVolume() { return volume; }
    public int getNumber() { return number; }
    public String getPages() { return pages; }

    // Format Methods - Will return a string of each citation style for journals
    @Override
    public String formatMLA() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + " \"" + this.getTitle() +"\" " + this.getSource() + ", vol. " + this.getVolume()
                + " no. " + this.getNumber() + " " + this.getDate() + " pp. " + this.getPages() + ".");
    }

    @Override
    public String formatAPA() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + " (" + this.getDate() + "). " + this.getTitle() + " " + this.getSource() + ", "
                + this.getVolume() + " (" + this.getNumber() + "), " + this.getPages() + ".");
    }

    @Override
    public String formatChicago() { // Format syntax taken from EasyBib.com
        return (this.getAuthor() + " \"" + this.getTitle() + "\" " + this.getSource() + " " + this.getVolume() + ", "
                + this.getNumber() + " (" + this.getDate() + "). " + this.getPages() + ".");
    }
}

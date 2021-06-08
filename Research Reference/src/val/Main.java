package val;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Book percyJackson = new Book();
        Journal smartScience = new Journal();
        Chapter ch3 = new Chapter();

        percyJackson.setAuthor(new Name("Rick", "Henry", "Riordan"));
        percyJackson.setCity("Albany");
        percyJackson.setState("New York");
        percyJackson.setCountry("USA");
        percyJackson.setTitle("The Lightning Thief");
        percyJackson.setDate(new Date(1997, 6, 21));
        percyJackson.setPublisher("Real Publisher, LLC.");

        smartScience.setAuthor(new Name("John", "Cedrick", "Doe"));
        smartScience.setNumber(113);
        smartScience.setVolume(4);
        smartScience.setDate(new Date(2003, 1, 2));
        smartScience.setTitle("Dumb Chemistry");
        smartScience.setSource("Smart Science");
        smartScience.setPages("66-73");

        ch3.setTitle("Third Degree Burns");
        ch3.setBookTitle("Book of Insults");
        ch3.setAuthor(new Name("Josie", "Gail", "Salmon"));
        ch3.setCity("New York");
        ch3.setState("New York");
        ch3.setCountry("USA");
        ch3.setPages("44-61");
        ch3.setDate(new Date(2019, 8, 24));
        ch3.setEditor(new Name("Molly", "Frank", "Burris"));
        ch3.setPublisher("New York Clearing House");

        System.out.println("Journal APA: ");
        smartScience.formatAPA();
        System.out.println("\nBook MLA: ");
        percyJackson.formatMLA();
        System.out.println("\nChapter Chicago: ");
        ch3.formatChicago();
    }
}

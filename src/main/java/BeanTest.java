public class BeanTest extends Album {
    public static void main(String[] args) {
        // Instantiate a few Album objects
        Album album1 = new Album();
        album1.setArtist("Michael Jackson");
        album1.setGenre("pop");
        album1.setName("Thriller");


//         Instantiate a few Author objects
        Author author1 = new Author();
        author1.setFirstName("Stehpen King");
        author1.setLocation("America");

        // Instantiate a few Quote objects
        Quotes quote1 = new Quotes();
        quote1.setContent("We make up horrors to help us cope with the real ones -");
        quote1.setAuthor("Stephen King");


        System.out.println(album1.getArtist() + " " + album1.getGenre());
        System.out.println(author1.getFirstName() + "-" + author1.getLocation());
        System.out.println(quote1.getContent() + " " + quote1.getAuthor());
    }
}

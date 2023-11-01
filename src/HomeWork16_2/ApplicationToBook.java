package HomeWork16_2;
;

public class ApplicationToBook {


        public static void main(String[] args) {

            Book book1 = new Book(" Faust", "Goethe", 1881, 978-836582547);

            Book book2 = new Book("Sonnets", " Shekespeare ", 1609, 978-1408017975);

            System.out.println("Book 1:");
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Year: " + book1.getYear());
            System.out.println("Isbn: " + book1.getIsbn());

            System.out.println("Book 2:");
            System.out.println("Title: " + book2.getTitle());
            System.out.println("Author: " + book2.getAuthor());
            System.out.println("Year: " + book2.getYear());
            System.out.println("Isbn: " + book2.getIsbn());


            System.out.println();


            System.out.println("Updated information about the first book:");
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Year: " + book1.getYear());
            System.out.println("Isbn: " + book1.getIsbn());


            System.out.println("Updated information about the second book:");
            System.out.println("Title: " + book2.getTitle());
            System.out.println("Author: " + book2.getAuthor());
            System.out.println("Year: " + book2.getYear());
            System.out.println("Isbn: " + book2.getIsbn());

        }
}


public class Student1 {
    public static void main(String[] args) {
        Books[] myBooks = new Books[]{
                new Books("Harry Potter", "JK Rowling", 500, "English"),
                new Books("I am number 4", "James Frey, Jobie Hughes", 440, "English"),
                new Books("Love is blind", "William Boyd", 465, "English")
        };
        System.out.println("You have " + myBooks.length + " books\n");
        for (Books book : myBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Language: " + book.getLanguage());
            System.out.println();
        }
    }
}

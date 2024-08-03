import java.util.Scanner;

public class Author {
    private int Author_no;
    public String Author_name;
    private int Author_contact;
    private String[] Book_title;

    Author(int id, String name, int contact, String[] books) {
        Author_no = id;
        Author_name = name;
        Author_contact = contact;
        Book_title = new String[2];
        for (int i = 0; i < 2; i++) {
            Book_title[i] = books[i];
        }
    }

    // getter
    public int getId() {
        return Author_no;
    }

    public String getName() {
        return Author_name;
    }

    public int getContact() {
        return Author_contact;
    }

    public String[] getBooks() {
        return Book_title;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Author: ");
        String Author_name = scan.nextLine();
        System.out.println("Enter 2 books by the Author: ");
        String[] books = new String[2];
        for (int i = 0; i < 2; i++) {
            books[i] = scan.nextLine();
        }
        System.out.println("Enter the Author id: ");
        int Author_no = scan.nextInt();
        System.out.println("Enter the Author contact: ");
        int Author_contact = scan.nextInt();

        Author auth = new Author(Author_no, Author_name, Author_contact, books);
        System.out.println("Author ID: " + auth.getId());
        System.out.println("Author Name: " + auth.getName());
        System.out.println("Author Contact: " + auth.getContact());
        String[] authorBooks = auth.getBooks();
        for (int i = 0; i < 2; i++) {
            System.out.println("[" + authorBooks[i] + "]");
        }
        scan.close();
    }
}

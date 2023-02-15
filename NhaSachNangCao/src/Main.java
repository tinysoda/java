import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> BookList = new ArrayList<Book>();
        ArrayList<Author> AuthorList = new ArrayList<Author>();
        int option;
        do {
            System.out.println("Choose: ");
            System.out.println("1: Them Sach\n2: Hien Sach\n3: Them tac gia\n4: tim tac gia\n5: thoat!1");
            option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Number of books to add: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int index = 0; index < n; index++) {
                        Book book = new Book();
                        book.input();
                        BookList.add(book);
                    }
                    break;
                case 2:
                    for (Book book : BookList) {
                        book.display();
                    }
                    break;
                case 3:
                    System.out.println("Number of author to add: ");
                    int m = Integer.parseInt(scan.nextLine());
                    for (int index = 0; index < m; index++) {
                        Author author1 = new Author();
                        author1.input();
                        // for (Author item : AuthorList) {
                        // if (item.penname != author1.penname) {
                        AuthorList.add(author1);
                        // }
                        // }
                    }
                    for (Author indexAuthor : AuthorList) {
                        indexAuthor.display();
                    }
                    break;
                case 4:
                    System.out.println("Nhap vao penname can tim: ");
                    String penname = scan.nextLine();
                    for (Author author : AuthorList) {
                        if (author.penname == penname) {
                            for (Book book : BookList) {
                                if (book.penName == penname) {
                                    book.display();
                                }
                            }
                        }
                    }

                    break;
                case 5:

                    break;

                default:
                    break;
            }
        } while (option != 5);
    }
}

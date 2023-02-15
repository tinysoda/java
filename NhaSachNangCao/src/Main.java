import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Book> BookList = new ArrayList<Book>();
        int option;
        do {
            System.out.println("Choose: ");
            System.out.println("1: Them Sach\n2: Hien Sach\n3:Them tac gia\n4: hien tac gia\n5: thoat!");
            option = Integer.parseInt(Scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Number of books to add: ");
                    int n = Integer.parseInt(Scanner.nextLine());
                    for (int index = 0; index < n; index++) {
                        Book book = new Book();
                        book.input();
                        BookList.add(book);
                    }
                    break;
                case 2:
                    for (Book book : BookList) {
                        System.out.println(book);
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    break;
            }
        } while (option != 5);
    }
}

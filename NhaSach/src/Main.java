public class Main {
    public static void main(String[] args) throws Exception {
        Publisher pub1 = new Publisher();
        pub1.input();
        pub1.display();

        Author aut1 = new Author();
        aut1.input();
        aut1.display();

        Book book1 = new Book();
        book1.input();
        book1.display();
    }
}

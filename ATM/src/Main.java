import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int option;
        int count;
        System.out.println("Nhap vao lua chon: ");
        Account account = new Account();
        System.out.println("Credentials:");
        do {
            String username;
            username = scan.nextLine();
            String password;
            password = scan.nextLine();
            if (username.equals("tinysoda") && password.equals("malibu")) {
                System.out.println("Dang nhap thanh cong.");
                break;
            } else {
                System.out.println("Wrong credentials!");
            }
        } while (true);
        do {
            option = Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:
                account.name=
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;

                default:
                System.out.println("Nhap sai");
                    break;
            }
        } while (option != 6);

    }
}

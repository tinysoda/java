import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // CatDeatail Cat1 = new CatDeatail();
        // Cat1.input();
        // Cat1.display();
        // ColorManager colorList = new ColorManager();
        // colorList.input();
        // colorList.display();
        int option;
        System.out.println("Nhap vao lua chon");
        Scanner scan = new Scanner(System.in);
        option = Integer.parseInt(scan.nextLine());
        ManagerCat catList = new ManagerCat();

        switch (option) {
            case 0:
                ColorManager colorManager = new ColorManager();
                colorManager.input();
                colorManager.display();
                break;
            case 1:
                catList.input();
                break;
            default:
                break;
        }
    }
}

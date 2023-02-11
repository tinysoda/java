import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circle tron1 = new Circle();
        Rectangle rec1 = new Rectangle();

        int key;
        do {
            System.out.println(
                    "1. Nhập thông tin hình tròn\n2. Tính chu vi hình tròn\n3. Tính diện tích hình tròn\n4. Nhập thông tin hcn\n5. Tính chu vi hcn\n6. Tính diện tích hcn\n7. Thoát");
            key = Integer.parseInt(scan.nextLine());
            switch (key) {
                case 1:
                    System.out.print("Nhap ban kinh hinh tron: ");
                    tron1.bankinh = Double.parseDouble(scan.nextLine());
                    break;
                case 2:
                    System.out.print("Chu vi hinh tron: ");
                    System.out.println(tron1.tinhChuvi());
                    break;
                case 3:
                    System.out.print("Dien tich hinh tron: ");
                    System.out.println(tron1.tinhDientich());
                    break;
                case 4:
                    System.out.print("Nhap chieu dai hcn: ");
                    rec1.chieudai = Double.parseDouble(scan.nextLine());
                    System.out.print("Nhap chieu rong hcn: ");
                    rec1.chieurong = Double.parseDouble(scan.nextLine());
                    break;
                case 5:
                    System.out.println("Chu vi hcn:");
                    System.out.println(rec1.tinhChuvi());
                    break;
                case 6:
                    System.out.println("Dien tich hcn:");
                    System.out.println(rec1.tinhDientich());
                    break;
                default:
                    break;
            }
        } while (key != 7);

    }
}

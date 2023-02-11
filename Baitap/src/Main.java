import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        bai3();
    }

    static int nhapN() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap max: ");
        int N = Integer.parseInt(scan.nextLine());
        return N;
    }

    static void bai1() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int N = nhapN();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.println("Nhap vao so thu: " + (i + 1));
            array.add(Integer.parseInt(scan.nextLine()));
            sum += array.get(i);
        }
        System.out.println("Tong: " + sum);
    }

    static void bai2() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int N = nhapN();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.print("Nhap vao so thu: " + (i + 1));
            array.add(Integer.parseInt(scan.nextLine()));
            if (array.get(i) % 3 == 0) {
                sum += array.get(i);
            }
        }
        System.out.print("Tong cac phan tu chia het cho 3: " + sum);
    }

    static void bai3() {
        int N = nhapN();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void bai4() {
        int max = nhapN();

    }
}

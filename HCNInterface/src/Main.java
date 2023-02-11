import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int N = Integer.parseInt(scan.nextLine());
        ArrayList<HCN> HCNList = new ArrayList<>();
        HCN hcn1 = new HCN();
        HCNList.add(hcn1);
        HCN hcn2 = new HCN();
        HCNList.add(hcn2);
        HCN hcn3 = new HCN();
        HCNList.add(hcn3);
        for (HCN hcn : HCNList) {
            hcn.setDaiRong(Double.parseDouble(scan.nextLine()), Double.parseDouble(scan.nextLine()));
        }
        for (HCN hcn : HCNList) {
            System.out.println(hcn);
        }
        // for (int i = 0; i < N; i++) {
        // for (int j = 0; j < N; j++) {
        HCN hcnmax = new HCN();

        double maxdientich = 0;
        for (HCN hcn : HCNList) {
            if (hcn.dientichHCN() > maxdientich) {
                maxdientich = hcn.dientichHCN();
                hcnmax = hcn;
            }
        }
        System.out.println("Hcn co dien tich lon nhat: ");
        hcnmax.display();
    }

}

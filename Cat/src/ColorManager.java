import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager implements Icat {
  ArrayList<String> colorList;

  public ArrayList<String> getColorList() {
    return this.colorList;
  }

  public void setColorList(ArrayList<String> colorList) {
    this.colorList = colorList;
  }

  public ColorManager() {
    colorList = new ArrayList<>();
  }

  @Override
  public void input() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Nhap vao so mau can them: ");
    int n;
    n = Integer.parseInt(scan.nextLine());
    System.out.println("Nhap vao cac mau: ");
    for (int i = 0; i < n; i++) {
      colorList.add(scan.nextLine());
    }

  }

  @Override
  public void display() {
    for (String color : colorList) {
      System.out.print("\t" + color);
    }
  }

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ManagerCat extends CatDetail implements Icat {
  /**
   * Quan ly danh sach meo nhap vao
   */
  ArrayList<CatDetail> catList;

  public ManagerCat() {
  }

  public ManagerCat(ArrayList<CatDetail> catList) {
    this.catList = catList;
  }

  public ArrayList<CatDetail> getCatList() {
    return this.catList;
  }

  public void setCatList(ArrayList<CatDetail> catList) {
    this.catList = catList;
  }

  @Override
  public void input() {
    System.out.println("So meo can nhap: ");
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < n; i++) {
      System.out.println("Nhap vao thong tin meo " + i + ": ");
      CatDetail cat = new CatDetail();
      cat.input();
      catList.add(cat);
    }

  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " catList='" + getCatList() + "'" +
        "}";
  }

}

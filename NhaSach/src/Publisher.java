import java.util.Scanner;

public class Publisher {
  String name;
  String foundDate;
  String foundYear;
  String representative;

  public Publisher() {

  }

  public Publisher(String name, String foundDate, String foundYear, String representative) {
    this.name = name;
    this.foundDate = foundDate;
    this.foundYear = foundYear;
    this.representative = representative;
  }

  public void input() {
    Scanner scan = new Scanner(System.in);

    // Scanner scan = new Scanner(System.in);
    // this.name = scan.nextLine();
    // this.foundDate = scan.nextLine();
    // this.foundYear = scan.nextLine();
    // this.representative = scan.nextLine();
    System.out.print("Nhap vao NXB : ");
    setName(scan.nextLine());
    System.out.print("Nhap vao ngay thanh lap : ");
    setFoundDate(scan.nextLine());
    System.out.print("Nhap vao nam thanh lap: ");
    setFoundYear(scan.nextLine());
    System.out.print("Nhap vao ten nguoi dai dien: ");
    setRepresentative(scan.nextLine());
  }

  public void display() {
    // System.out.println(this.name);
    // System.out.println(this.foundDate);
    // System.out.println(this.foundYear);
    // System.out.println(this.representative);
    System.out.println(this);
    // This goi den ham toString()
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFoundDate() {
    return this.foundDate;
  }

  public void setFoundDate(String foundDate) {
    this.foundDate = foundDate;
  }

  public String getFoundYear() {
    return this.foundYear;
  }

  public void setFoundYear(String foundYear) {
    this.foundYear = foundYear;
  }

  public String getRepresentative() {
    return this.representative;
  }

  public void setRepresentative(String representative) {
    this.representative = representative;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", foundDate='" + getFoundDate() + "'" +
        ", foundYear='" + getFoundYear() + "'" +
        ", representative='" + getRepresentative() + "'" +
        "}";
  }

}

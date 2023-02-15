import java.util.Scanner;

public class Book {
  String name;
  String DOP;
  String penName;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDOP() {
    return this.DOP;
  }

  public void setDOP(String DOP) {
    this.DOP = DOP;
  }

  public String getPenName() {
    return this.penName;
  }

  public void setPenName(String penName) {
    this.penName = penName;
  }

  public Book() {
  }

  public Book(String name, String DOP, String penName) {
    this.name = name;
    this.DOP = DOP;
    this.penName = penName;
  }

  public void input() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Book Name: ");
    this.setName(scan.nextLine());
    System.out.println("Book DOP: ");
    this.setDOP((scan.nextLine()));
    System.out.println("Book PenName: ");
    this.setPenName((scan.nextLine()));
  }

  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", DOP='" + getDOP() + "'" +
        ", penName='" + getPenName() + "'" +
        "}";
  }

}

import java.util.Scanner;

public class Book {
  String name;
  String penName;
  String publisher;

  Scanner scan = new Scanner(System.in);

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPenName() {
    return this.penName;
  }

  public void setPenName(String penName) {
    this.penName = penName;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Book() {
  }

  public Book(String name, String penName, String publisher) {
    this.name = name;
    this.penName = penName;
    this.publisher = publisher;
  }

  public void display() {
    System.out.println(toString());
  }

  public void input() {
    setName(scan.nextLine());
    setPenName(scan.nextLine());
    setPublisher(scan.nextLine());
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", penName='" + getPenName() + "'" +
        ", publisher='" + getPublisher() + "'" +
        "}";
  }

}

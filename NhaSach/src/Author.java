import java.util.Scanner;

public class Author {
  String name;
  String penName;
  String DOB;

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

  public String getDOB() {
    return this.DOB;
  }

  public void setDOB(String DOB) {
    this.DOB = DOB;
  }

  public Author() {

  }

  public Author(String name, String penName, String DOB) {
    this.name = name;
    this.penName = penName;
    this.DOB = name;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", penName='" + getPenName() + "'" +
        ", DOB='" + getDOB() + "'" +
        "}";
  }

  public void display() {
    System.out.println(toString());
  }

  public void input() {
    setName(scan.nextLine());
    setPenName(scan.nextLine());
    setDOB(scan.nextLine());
  }
}

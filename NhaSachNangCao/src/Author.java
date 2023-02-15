import java.util.Scanner;

public class Author {
  String name;
  String age;
  String DOB;
  String penname;

  public Author() {
  }

  public Author(String name, String age, String DOB, String penname) {
    this.name = name;
    this.age = age;
    this.DOB = DOB;
    this.penname = penname;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return this.age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getDOB() {
    return this.DOB;
  }

  public void setDOB(String DOB) {
    this.DOB = DOB;
  }

  public String getPenname() {
    return this.penname;
  }

  public void setPenname(String penname) {
    this.penname = penname;
  }

  public void input() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Nhap ten:");
    setName(scan.nextLine());
    System.out.println("Nhap tuoi:");
    setAge(scan.nextLine());
    System.out.println("Nhap penname:");
    setPenname(scan.nextLine());

  }

  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", age='" + getAge() + "'" +
        ", DOB='" + getDOB() + "'" +
        ", penname='" + getPenname() + "'" +
        "}";
  }

}

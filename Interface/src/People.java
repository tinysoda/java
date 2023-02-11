import java.util.Scanner;

public class People implements IInfo {
  String name;
  int age;
  String address;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public void showInfo() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", age='" + getAge() + "'" +
        ", address='" + getAddress() + "'" +
        "}";
  }

  Scanner scan = new Scanner(System.in);

  public void input() {
    System.out.println("Person name: ");
    setName(scan.nextLine());
    System.out.println("Person age: ");
    setAge(Integer.parseInt(scan.nextLine()));
    System.out.println("Person address: ");
    setAddress(scan.nextLine());
  }

}

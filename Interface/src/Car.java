import java.util.Scanner;

public class Car implements IInfo {
  String name;
  String color;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void showInfo() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", color='" + getColor() + "'" +
        "}";
  }

  Scanner scan = new Scanner(System.in);

  public void input() {
    System.out.println("Car name:");
    setName(scan.nextLine());
    System.out.println("Car color:");
    setColor(scan.nextLine());
  }

}

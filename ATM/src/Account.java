import java.util.Scanner;

public class Account {
  String name;
  String stk;
  double money;
  String sdt;
  String address;

  public Account() {
  }

  public Account(String name, String stk, double money, String sdt, String address) {
    this.name = name;
    this.stk = stk;
    this.money = money;
    this.sdt = sdt;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public String setName(String name) {
    return this.name = name;
  }

  public String getStk() {
    return this.stk;
  }

  public void setStk(String stk) {
    this.stk = stk;
  }

  public double getMoney() {
    return this.money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public String getSdt() {
    return this.sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    
    this.name=setName(scanner.nextLine());
  }
}

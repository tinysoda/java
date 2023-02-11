public class Main {
  public static void main(String[] args) {
    Dog d = new Dog();
    // d.input();
    d.setName("Xu");
    // d.display();
    d.sound();
    System.out.println(d.getName());
    Cat c = new Cat();
    c.sound();
  }
}
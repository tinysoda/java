public abstract class Animal {
  String name;
  int age;
  String description;

  public abstract void showSound();

  public Animal() {
  }

  public Animal(String name, int age, String description) {
    this.name = name;
    this.age = age;
    this.description = description;
  }

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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", age='" + getAge() + "'" +
        ", description='" + getDescription() + "'" +
        "}";
  }

  public void input() {

  }

  public void display() {

  }
}

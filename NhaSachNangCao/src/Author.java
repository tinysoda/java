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
    System.out.println("Nhap ten:");
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

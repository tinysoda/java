import java.util.Scanner;

/**
 * CatDetail
 */
public class CatDetail {

  String species;
  String color;
  String habitat;

  public CatDetail(String species, String color, String habitat) {
    this.species = species;
    this.color = color;
    this.habitat = habitat;
  }

  public CatDetail() {
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSpecies() {
    return this.species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getHabitat() {
    return this.habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public void input() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Nhap mau meo: ");
    setColor(scan.nextLine());
    System.out.println("Nhap loai meo: ");
    setSpecies(scan.nextLine());
    System.out.println("Nhap noi song: ");
    setHabitat(scan.nextLine());
  }

  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " species='" + getSpecies() + "'" +
        ", color='" + getColor() + "'" +
        ", habitat='" + getHabitat() + "'" +
        "}";
  }

}
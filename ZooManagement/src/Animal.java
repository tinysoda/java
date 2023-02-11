/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author diepvan
 */
public abstract class Animal {
  String name;
  int age;
  String foodType;

  public Animal() {
  }

  public Animal(String name, int age, String foodType) {
    this.name = name;
    this.age = age;
    this.foodType = foodType;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // public int getAge() {
  // return age;
  // }

  // public void setAge(int age) {
  // this.age = age;
  // }

  // public String getFoodType() {
  // return foodType;
  // }

  // public void setFoodType(String foodType) {
  // this.foodType = foodType;
  // }

  public void input() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Nhap ten: ");
    name = scan.nextLine();

    System.out.println("Nhap tuoi: ");
    age = Integer.parseInt(scan.nextLine());

    System.out.println("Nhap thuc an: ");
    foodType = scan.nextLine();
  }

  public void display() {
    System.out.println("Ten: " + name + ", tuoi: " + age + ", thuc an: " + foodType);
    // System.out.println(toString());
    // System.out.println(this);
  }

  @Override
  public String toString() {
    return "name=" + name + ", age=" + age + ", foodType=" + foodType;
  }

  // public void sound() {
  // }

  public abstract void sound();
}

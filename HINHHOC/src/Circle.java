/**
 * Hinhhoc
 */
public class Circle extends Geometry {
  double PI = getPI();

  @Override
  public double tinhChuvi() {
    double chuvi = bankinh * 2 * PI;
    return chuvi;
  }

  @Override
  public double tinhDientich() {
    // TODO Auto-generated method stub
    double dientich = bankinh * bankinh * PI;
    return dientich;
  }

  public double getPI() {
    return 3.14;
  }

}
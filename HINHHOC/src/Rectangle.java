/**
 * Rectangle
 */
public class Rectangle extends Geometry {

  @Override
  public double tinhChuvi() {
    double chuvi = (chieudai + chieurong) * 2;
    return chuvi;
  }

  @Override
  public double tinhDientich() {
    // TODO Auto-generated method stub
    double dientich = chieudai * chieurong;
    return dientich;
  }

}
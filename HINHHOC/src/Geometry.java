public abstract class Geometry {
  double bankinh;
  double chieudai;
  double chieurong;

  public double getBankinh() {
    return this.bankinh;
  }

  public void setBankinh(double bankinh) {
    this.bankinh = bankinh;
  }

  public double getChieudai() {
    return this.chieudai;
  }

  public void setChieudai(double chieudai) {
    this.chieudai = chieudai;
  }

  public double getChieurong() {
    return this.chieurong;
  }

  public void setChieurong(double chieurong) {
    this.chieurong = chieurong;
  }

  public abstract double tinhChuvi();

  public abstract double tinhDientich();
}

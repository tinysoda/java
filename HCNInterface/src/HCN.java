public class HCN implements HCNInterface {
  double ChieuDai;
  double ChieuRong;
  double DienTich = dientichHCN();

  @Override
  public double dientichHCN() {

    return getChieuDai() * getChieuRong();
  }

  @Override
  public double getChieuDai() {

    return ChieuDai;
  }

  @Override
  public double getChieuRong() {
    // TODO Auto-generated method stub
    return ChieuRong;
  }

  @Override
  public void setDaiRong(double cd, double cr) {
    ChieuDai = cd;
    ChieuRong = cr;
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "{" +
        " ChieuDai='" + getChieuDai() + "'" +
        ", ChieuRong='" + getChieuRong() + "'" +
        ", DienTich='" + dientichHCN() + "'" +
        "}";
  }

}

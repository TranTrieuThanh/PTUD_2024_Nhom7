package Entity;

public class DichVu {
private String MaDV;
private String TenDV;
private double Dongia;
public String getMaDV() {
	return MaDV;
}
public void setMaDV(String maDV) {
	MaDV = maDV;
}
public String getTenDV() {
	return TenDV;
}
public void setTenDV(String tenDV) {
	TenDV = tenDV;
}
public double getDongia() {
	return Dongia;
}
public void setDongia(double dongia) {
	Dongia = dongia;
}
public DichVu() {
	super();
	// TODO Auto-generated constructor stub
}
public DichVu(String maDV, String tenDV, double dongia) {
	super();
	MaDV = maDV;
	TenDV = tenDV;
	Dongia = dongia;
}
@Override
public String toString() {
	return "DichVu [MaDV=" + MaDV + ", TenDV=" + TenDV + ", Dongia=" + Dongia + "]";
}

}

package Entity;

public class KhachHang {
private String MaKH;
private String TenKH;
private int Tuoi;
private boolean GioiTinh;
//true=nam, false= nu
private int SDT;
public String getMaKH() {
	return MaKH;
}
public void setMaKH(String maKH) {
	MaKH = maKH;
}
public String getTenKH() {
	return TenKH;
}
public void setTenKH(String tenKH) {
	TenKH = tenKH;
}
public int getTuoi() {
	return Tuoi;
}
public void setTuoi(int tuoi) {
	Tuoi = tuoi;
}
public boolean isGioiTinh() {
	return GioiTinh;
}
public void setGioiTinh(boolean gioiTinh) {
	GioiTinh = gioiTinh;
}
public int getSDT() {
	return SDT;
}
public void setSDT(int sDT) {
	SDT = sDT;
}
public KhachHang() {
	super();
	// TODO Auto-generated constructor stub
}
public KhachHang(String maKH, String tenKH, int tuoi, boolean gioiTinh, int sDT) {
	super();
	MaKH = maKH;
	TenKH = tenKH;
	Tuoi = tuoi;
	GioiTinh = gioiTinh;
	SDT = sDT;
}
@Override
public String toString() {
	return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", Tuoi=" + Tuoi + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT
			+ "]";
}

}

package Entity;

public class Phong {
private String MaPhong;
private String LoaiPhong;
private String TenPhong;
private String TinhTrang;
private double GiaPhong;
public String getMaPhong() {
	return MaPhong;
}
public void setMaPhong(String maPhong) {
	MaPhong = maPhong;
}
public String getLoaiPhong() {
	return LoaiPhong;
}
public void setLoaiPhong(String loaiPhong) {
	LoaiPhong = loaiPhong;
}
public String getTenPhong() {
	return TenPhong;
}
public void setTenPhong(String tenPhong) {
	TenPhong = tenPhong;
}
public String getTinhTrang() {
	return TinhTrang;
}
public void setTinhTrang(String tinhTrang) {
	TinhTrang = tinhTrang;
}
public double getGiaPhong() {
	return GiaPhong;
}
public void setGiaPhong(double giaPhong) {
	GiaPhong = giaPhong;
}
public Phong() {
	super();
	// TODO Auto-generated constructor stub
}
public Phong(String maPhong, String loaiPhong, String tenPhong, String tinhTrang, double giaPhong) {
	super();
	MaPhong = maPhong;
	LoaiPhong = loaiPhong;
	TenPhong = tenPhong;
	TinhTrang = tinhTrang;
	GiaPhong = giaPhong;
}
@Override
public String toString() {
	return "Phong [MaPhong=" + MaPhong + ", LoaiPhong=" + LoaiPhong + ", TenPhong=" + TenPhong + ", TinhTrang="
			+ TinhTrang + ", GiaPhong=" + GiaPhong + "]";
}

}

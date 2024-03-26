package Entity;

public class NhanVien {
private String MaNV;
private String TenNV;
private String ChucVu;
private String DiaChi;
private boolean GioiTinh;
//true= "nam", false= "nu"
private int Tuoi;
private double Luong;
public String getMaNV() {
	return MaNV;
}
public void setMaNV(String maNV) {
	MaNV = maNV;
}
public String getTenNV() {
	return TenNV;
}
public void setTenNV(String tenNV) {
	TenNV = tenNV;
}
public String getChucVu() {
	return ChucVu;
}
public void setChucVu(String chucVu) {
	ChucVu = chucVu;
}
public String getDiaChi() {
	return DiaChi;
}
public void setDiaChi(String diaChi) {
	DiaChi = diaChi;
}
public boolean isGioiTinh() {
	return GioiTinh;
}
public void setGioiTinh(boolean gioiTinh) {
	GioiTinh = gioiTinh;
}
public int getTuoi() {
	return Tuoi;
}
public void setTuoi(int tuoi) {
	Tuoi = tuoi;
}
public double getLuong() {
	return Luong;
}
public void setLuong(double luong) {
	Luong = luong;
}
public NhanVien() {
	super();
	// TODO Auto-generated constructor stub
}
public NhanVien(String maNV, String tenNV, String chucVu, String diaChi, boolean gioiTinh, int tuoi, double luong) {
	super();
	MaNV = maNV;
	TenNV = tenNV;
	ChucVu = chucVu;
	DiaChi = diaChi;
	GioiTinh = gioiTinh;
	Tuoi = tuoi;
	Luong = luong;
}
@Override
public String toString() {
	return "NhanVien [MaNV=" + MaNV + ", TenNV=" + TenNV + ", ChucVu=" + ChucVu + ", DiaChi=" + DiaChi + ", GioiTinh="
			+ GioiTinh + ", Tuoi=" + Tuoi + ", Luong=" + Luong + "]";
}

}

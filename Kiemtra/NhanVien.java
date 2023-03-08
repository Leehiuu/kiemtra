package Kiemtra;

public abstract class NhanVien {
    protected String maNhanVien;
    protected String hoTen;
    protected String namSinh;
    protected String diaChi;
    public NhanVien(String maNhanVien, String hoTen, String namSinh, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    public String getNamSinh() {
        return namSinh;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public String toString() {
        return "Mã nhân viên: " + maNhanVien + ", Họ tên: " + hoTen +
                ", Năm sinh: " + namSinh + ", Địa chỉ: " + diaChi;
    }

    public abstract String moTaCongViec();
}
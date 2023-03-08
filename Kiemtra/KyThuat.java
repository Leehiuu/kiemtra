package Kiemtra;

class KyThuat extends NhanVien {
    private String chuyenNganh;
    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public String getChuyenNganh() {
        return chuyenNganh;
    }
    public String toString() {
        return super.toString() + ", Chuyên nghành: " + chuyenNganh;
    }
    public String moTaCongViec() {
        return "Lập Trình Viên";
    }

}
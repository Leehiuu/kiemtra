package Kiemtra;
/*Bai 2 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        KyThuat nv1 = new KyThuat("TP1234", "Nguyen Van A", "01/01/2000", "Ha Noi", "CNTT");

        KyThuat nv2 = new KyThuat("TP5678", "Tran Thi B", "02/02/2000", "Ho Chi Minh", "Mang may tinh");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã nhân viên: ");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập chuyên nghành: ");
        String chuyenNganh = sc.nextLine();
        KyThuat KyThuat2 = new KyThuat(maNhanVien, hoTen, namSinh, diaChi, chuyenNganh);
        System.out.println(KyThuat2);

    }
}

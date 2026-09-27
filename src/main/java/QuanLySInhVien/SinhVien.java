package QuanLySinhVien;

import java.util.Date;

public class SinhVien {
    private String userID;
    private String hoTenSinhVien;
    private Date ngaySinh;
    private String gioiTinh;
    private String maSinhVien;
    private String maLop;
    private float diemToan;
    private float diemVan;
    private float diemAnh;
    private float diemTB;
    private String email;
    public static int cnt = 0;

    public SinhVien(String hoTenSinhVien, Date ngaySinh, String gioiTinh, String maSinhVien, String maLop, float diemToan, float diemVan, float diemAnh) {
        this.hoTenSinhVien = hoTenSinhVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maSinhVien = maSinhVien;
        this.maLop = maLop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }
}

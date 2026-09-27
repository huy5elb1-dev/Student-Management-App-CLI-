package QuanLySinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public SinhVien(String hoTenSinhVien, String ngaySinh, String gioiTinh,
                    String maSinhVien, String maLop,
                    float diemToan, float diemVan, float diemAnh) throws ParseException {
        cnt++;
        this.userID = String.format("STT%03d", cnt);
        this.hoTenSinhVien = hoTenSinhVien;
        this.ngaySinh = (new SimpleDateFormat("dd/MM/yyyy")).parse(ngaySinh);
        this.gioiTinh = gioiTinh;
        this.maSinhVien = maSinhVien;
        this.maLop = maLop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    @Override
    public String toString() {
        return  userID +
                " "  + hoTenSinhVien +
                " " + (new SimpleDateFormat("dd/MM/yyyy")).format(ngaySinh) +
                " " + gioiTinh +
                " " + maSinhVien +
                " " + maLop +
                " " + diemToan +
                " " + diemVan +
                " " + diemAnh +
                " " + diemTB;
    }
}

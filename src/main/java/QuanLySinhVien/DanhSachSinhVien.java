package QuanLySinhVien;

import java.util.ArrayList;

public class DanhSachSinhVien {
    public ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }
    //1.   Thêm mới một sinh viên vào danh sách.
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
}

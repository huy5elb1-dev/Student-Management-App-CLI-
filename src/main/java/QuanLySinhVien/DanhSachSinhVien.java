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
    //2.   Liệt kê danh sách sinh viên đã tạo.
    public void inraDanhSach(){
        for(SinhVien sv : danhSach){
            System.out.println(sv);
        }
    }
    //3.   Xóa một sinh viên ra khỏi danh sách theo mã sinh viên.
    public void xoaTenSinhVien(String ma){
        for(SinhVien sv : danhSach){
            if(sv.getMaSinhVien().equals(ma)){
                this.danhSach.remove(sv);
                break;
            }
        }

    }
}

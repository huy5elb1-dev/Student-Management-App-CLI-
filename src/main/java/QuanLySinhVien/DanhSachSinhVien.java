package QuanLySinhVien;

import java.util.ArrayList;
import java.util.Collections;

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
    //4.   Tìm kiếm các sinh viên có chung mã ngành (CN, AT, KT, DT).
    public void sinhVienTheoNganh(String s){
        String tmp = "";
        if(s.equals("Cong nghe thong tin")) tmp += "CN";
        else if(s.equals("An toan thong tin")) tmp += "AT";
        else if(s.equals("Ke toan")) tmp += "KT";
        else if(s.equals("Dien tu")) tmp += "DT";
        for (SinhVien sv : danhSach){
            if(sv.getMaLop().substring(5,7).equals(tmp)){
                System.out.println(sv);
            }
        }
    }
    //5.   Liệt kê danh sách sinh viên có điểm trung bình từ cao đến thấp.
    public void sapXepTheoDiemTB(){
        Collections.sort(danhSach);
        for(SinhVien sv : danhSach){
            System.out.println(sv + " " + String.format("%.1f", sv.getDiemTB()));
        }
    }
    //6.   Kiểm tra xem sinh viên đó tồn tại trong danh sách hay không.
    public void check(String ma){
         int check = 0;
         for(SinhVien sv : danhSach){
             if(sv.getMaSinhVien().equals(ma)){
                 System.out.println("Kết quả tìm kiếm: " + sv);
                 check = 1;
                 break;
             }
         }
         if(check == 0){
             System.out.println("Kết quả tìm kiếm: Không tồn tại");
         }
    }
    // 7.   Đánh giá hạnh kiểm của một sinh viên theo mã sinh viên trong danh sách theo điểm TB.
    public void danhGiaHanhKiem(){
        for(SinhVien sv : danhSach){
            if(sv.getDiemTB() >= 9){
                System.out.println(sv + " " + sv.getDiemTB() + " Xuất sắc");
            }
            else if(sv.getDiemTB() >= 8){
                System.out.println(sv + " " + sv.getDiemTB() + " Giỏi");
            }
            else if(sv.getDiemTB() >= 7.5){
                System.out.println(sv + " " + sv.getDiemTB() + " Trung bình");
            }
            else if(sv.getDiemTB() >= 5){
                System.out.println(sv + " " + sv.getDiemTB() + " Khá");
            }
            else{
                System.out.println(sv + " " + sv.getDiemTB() + " Yếu");
            }
        }
    }
}

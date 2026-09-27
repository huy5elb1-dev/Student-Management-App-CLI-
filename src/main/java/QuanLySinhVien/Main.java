package QuanLySinhVien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int yourChoice = 0;
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        do {
            System.out.println("---------Welcom to Student Management PTIT S-Link!---------");
            System.out.println("     Please choose one of options below to continue:    ");
            System.out.println("1.   Thêm mới một sinh viên vào danh sách.\n" +
                    "2.   Liệt kê danh sách sinh viên đã tạo.\n" +
                    "3.   Xóa một sinh viên ra khỏi danh sách theo mã sinh viên.\n" +
                    "4.   Tìm kiếm các sinh viên có chung mã ngành.\n" +
                    "5.   Liệt kê danh sách sinh viên có điểm trung bình từ cao đến thấp.\n" +
                    "6.   Kiểm tra xem sinh viên đó tồn tại trong danh sách hay không.\n" +
                    "7.   Đánh giá hạnh kiểm của một sinh viên theo mã sinh viên trong danh sách theo điểm TB.\n" +
                    "8.   Sắp xếp thí sinh theo ngày sinh từ già đến trẻ.\n" +
                    "9.   Liệt kê danh sách email được cấp theo tên sinh viên. \n" +
                    "10.  In ra số lượng sinh viên theo từng lớp học trong danh sách.");
            yourChoice =Integer.parseInt(sc.nextLine());
            if(yourChoice == 1){
                System.out.print("Nhập Họ và tên: ");
                String hoTenSinhVien = sc.nextLine();
                System.out.print("Ngày sinh chuẩn dd/MM/yyyy: ");
                String ngaySinh = sc.nextLine();
                System.out.print("Giới tính: ");
                String gioiTinh = sc.nextLine();
                System.out.print("Mã sinh viên: ");
                String maSinhVien = sc.nextLine();
                System.out.print("Mã lớp sinh viên: ");
                String maLop = sc.nextLine();
                System.out.println("Điểm các môn học: ");
                float diemToan = Float.parseFloat(sc.nextLine());
                float diemVan = Float.parseFloat(sc.nextLine());
                float diemAnh = Float.parseFloat(sc.nextLine());
                SinhVien sv = new SinhVien(hoTenSinhVien, ngaySinh, gioiTinh, maSinhVien, maLop
                , diemToan, diemVan, diemAnh);
                dssv.themSinhVien(sv);
            }
        } while(yourChoice != 0);

    }
}

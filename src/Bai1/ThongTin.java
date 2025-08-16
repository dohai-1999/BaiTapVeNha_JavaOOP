package Bai1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("MS01", "Nguyễn Văn A",26,"0999999999","HaNoi");
        NhanVien nhanVien2 = new NhanVien("MS02", "Nguyễn Văn B",26,"0888888888","HaNoi");

        nhanVien1.showInfo();
        System.out.println("=================");
        nhanVien2.showInfo();
    }
}

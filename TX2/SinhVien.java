import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable {
    private String hoTen;
    private int ngaySinh;
    private String gioiTinh;
    private String CCCD;
    private String maSV;
    private String nganhNghe;
    private String tenTK;
    private String mkTK;
    private float m1;
    private float m2;
    private float m3;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int ngaySinh, String gioiTinh, String CCCD, String maSV, String nganhNghe, String tenTK, String mkTK, float m1, float m2, float m3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CCCD = CCCD;
        this.maSV = maSV;
        this.nganhNghe = nganhNghe;
        this.tenTK = tenTK;
        this.mkTK = mkTK;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        setDiemTB(m1, m2, m3);
    }
    public void nhap(){
        System.out.println("Nhap ho ten : ");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh : ");
        ngaySinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh : ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap CCCD : ");
        CCCD = sc.nextLine();
        System.out.println("Nhap ma sinh vien : ");
        maSV = sc.nextLine();
        System.out.println("Nhap nganh nghe : ");
        nganhNghe = sc.nextLine();
        System.out.println("Nhap ten tai khoan :");
        tenTK = sc.nextLine();
        System.out.println("Nhap mat khau : ");
        mkTK = sc.nextLine();
        System.out.println("Nhap diem m1 : ");
        m1 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem m2: ");
        m2 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem m3 :");
        m3 = Float.parseFloat(sc.nextLine());
        setDiemTB(m1, m2, m3);
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiemTB(float m1, float m2, float m3) {
        this.diemTB = (m1+m2+m3)/3;
    }

    public static void inTieuDe(){
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %n","Ho Ten","Ngay Sinh","Gioi Tinh","CCCD","Ma Sinh Vien","Nganh Nghe","Tai Khoan","Mat Khau","Diem m1","Diem m2","Diem m3","Diem Trung Binh");
    }

    public void inDL(){
        System.out.printf("%20s %20d %20s %20s %20s %20s %20s %20s %20f %20f %20f %20f %n",hoTen,ngaySinh,gioiTinh,CCCD, maSV, nganhNghe, tenTK, mkTK,m1,m2,m3,diemTB);
    }
}

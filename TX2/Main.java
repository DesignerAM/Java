import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static QLSinhVien qlSinhVien = new QLSinhVien();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Hien thi sinh vien");
            System.out.println("3. Tim kiem");
            System.out.println("4. Them ban ghi");
            System.out.println("5. Sua ban ghi");
            System.out.println("6. Xoa ban ghi");
            System.out.println("7. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so sinh vien can them : ");
                    int n;
                    n = Integer.parseInt(sc.nextLine());
                    for(int i = 0; i<n; i++){
                        SinhVien burh = new SinhVien();
                        burh.nhap();
                        qlSinhVien.addSV(burh);
                    }
                    break;
                case 2:
                    qlSinhVien.inDS();
                    break;
                case 3:
                    System.out.println("Nhap id sinh vien can tim kiem : ");
                    String id;
                    id = sc.nextLine();
                    qlSinhVien.findSV(id);
                    break;
                case 4:
                    SinhVien lmao = new SinhVien();
                    lmao.nhap();
                    qlSinhVien.addSV(lmao);
                    break;
                case 5:
                    System.out.println("Nhap ten sinh vien can sua : ");
                    String ten;
                    ten= sc.nextLine();
                    qlSinhVien.editSV(ten);
                    break;
                case 6:
                    System.out.println("Nhap id sinh vien can xoa : ");
                    id = sc.nextLine();
                    qlSinhVien.deleteSV(id);
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chọn chức năng không hợp lệ!");
            }
        } while (true);

    }
}
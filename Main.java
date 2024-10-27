package StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo Scanner

        try {
            while (true) {
                System.out.println("1. Add new student");
                System.out.println("2. Display all students");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        // Gọi phương thức để nhập sinh viên
                        break;
                    case 2:
                        // Gọi phương thức để hiển thị sinh viên
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        } finally {
            scanner.close(); // Đóng Scanner
        }
    }
}

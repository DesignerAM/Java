package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInputOutputImpl implements StudentInputOutput {
    private List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void inputStudent() {
        // Nhập thông tin sinh viên từ bàn phím
        Student student = new Student();
        
        System.out.print("Enter Student ID: ");
        student.setStudentID(scanner.nextLine());
        
        System.out.print("Enter Full Name: ");
        student.setFullName(scanner.nextLine());
        
        System.out.print("Enter Major: ");
        student.setMajor(scanner.nextLine());
        
        System.out.print("Enter Username: ");
        student.setUsername(scanner.nextLine());
        
        System.out.print("Enter Password: ");
        student.setPassword(scanner.nextLine());
        
        // Thêm sinh viên vào danh sách
        studentList.add(student);
    }

    @Override
    public void displayStudentInfo() {
        // Hiển thị thông tin của tất cả sinh viên
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println("---------------------------");
        }
    }
}

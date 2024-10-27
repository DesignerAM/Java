package StudentManagement;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Phương thức thêm sinh viên
    public void addStudent(Student student) {
        students.add(student);
    }

    // Phương thức sửa sinh viên theo mã sinh viên
    public void updateStudent(String studentID, Student newStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(studentID)) {
                students.set(i, newStudent);
                break;
            }
        }
    }

    // Phương thức xóa sinh viên theo mã sinh viên
    public void deleteStudent(String studentID) {
        students.removeIf(student -> student.getStudentID().equals(studentID));
    }

    // Phương thức tìm kiếm sinh viên theo tên
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null; // Nếu không tìm thấy
    }

    // Phương thức tìm kiếm sinh viên theo mã sinh viên
    public Student findStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null; // Nếu không tìm thấy
    }

    // Phương thức hiển thị toàn bộ danh sách sinh viên
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("--------------------");
        }
    }
}
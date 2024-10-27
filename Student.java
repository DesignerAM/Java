package StudentManagement;

// Lớp Student kế thừa từ lớp Person
public class Student extends Person {
    private String studentID;
    private String major;
    private String username;
    private String password;

    // Constructor mặc định
    public Student() {}

    // Constructor với tham số đầy đủ
    public Student(String fullName, String birthDate, String gender, String cccd, 
                   String studentID, String major, String username, String password) {
        super(fullName, birthDate, gender, cccd);  // Gọi constructor của lớp cha Person
        this.studentID = studentID;
        this.major = major;
        this.username = username;
        this.password = password;
    }

    // Getter và Setter cho các thuộc tính riêng
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Phương thức hiển thị thông tin sinh viên (Override từ lớp Person)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Gọi phương thức displayInfo của lớp cha Person
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("Username: " + username);
    }
}

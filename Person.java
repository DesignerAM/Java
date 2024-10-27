package StudentManagement;

public class Person {

    private String fullName;
    private String birthDate;
    private String gender;
    private String cccd;

    // Constructor mặc định
    public Person() {}

    // Constructor đầy đủ tham số
    public Person(String fullName, String birthDate, String gender, String cccd) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.cccd = cccd;
    }

    // Getter và Setter đúng quy ước đặt tên
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("CCCD: " + cccd);
    }
}

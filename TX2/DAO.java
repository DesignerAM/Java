import java.io.*;
import java.util.ArrayList;

public class DAO {
    private static final String FILE_PATH = "students.dat";

    public void writeToFile(ArrayList<SinhVien> studentList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SinhVien> readFromFile() {
        ArrayList<SinhVien> studentList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            studentList = (ArrayList<SinhVien>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Initializing new list.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}

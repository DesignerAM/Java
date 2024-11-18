import java.util.ArrayList;

public class QLSinhVien {
    private ArrayList<SinhVien> dsSV;
    private DAO dao;

    public QLSinhVien() {
        dao  = new DAO();
        dsSV = dao.readFromFile();
    }

    public void inDS(){
        SinhVien.inTieuDe();
        for(SinhVien sv:dsSV){
            sv.inDL();
        }
    }
    public void addSV(SinhVien sv){
        if(sv != null){
            dsSV.add(sv);
            dao.writeToFile(dsSV);
            System.out.println("Them thanh cong !!!");
        }
    }
    public void deleteSV(String id){
        for(int i = 0; i<dsSV.size();i++){
            if(dsSV.get(i).getMaSV().equalsIgnoreCase(id)){
                dsSV.remove(dsSV.get(i));
                dao.writeToFile(dsSV);
                System.out.println("Xoa thanh cong !!!");
            }
        }
    }
    public void editSV(String ten){
        for(int i = 0; i<dsSV.size();i++){
            if(dsSV.get(i).getHoTen().equalsIgnoreCase(ten)){
                dsSV.get(i).nhap();
                dao.writeToFile(dsSV);
                System.out.println("Sua thanh cong !!!");
            }
        }
    }
    public void findSV(String id){
        for(int i = 0; i<dsSV.size(); i++){
            if(dsSV.get(i).getMaSV().equalsIgnoreCase(id)){
                dsSV.get(i).inDL();
            }
        }
    }
}

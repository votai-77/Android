package tdc.edu.vn.myapplication.Model;

public class ThietBi {
    String maLoai, tenLoai;

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }



    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }



    @Override
    public String toString() {
        return "ThietBi{" +
                "maLoai='" + maLoai + '\'' +
                ", tenLoai='" + tenLoai + '\'' +
                +
                '}';
    }
}

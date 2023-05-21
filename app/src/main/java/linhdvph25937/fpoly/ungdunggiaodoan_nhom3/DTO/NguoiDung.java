package linhdvph25937.fpoly.ungdunggiaodoan_nhom3.DTO;

public class NguoiDung {
    private int id;
    private String tenTaiKhoan;
    private String matKhau;

    public NguoiDung(int id, String tenTaiKhoan, String matKhau) {
        this.id = id;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
    }

    public NguoiDung() {
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

}

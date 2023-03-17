
package LoginForm;

public class UserData {
    private String nama;
    private String nim;
    private String kelas;

    public UserData(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }
}

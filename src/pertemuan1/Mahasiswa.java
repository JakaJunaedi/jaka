package pertemuan1;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private int umur;

    public void makan(){
        System.out.println(this.nama +" sedang makan NASI");
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    private String getNama(){
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampil(){
        System.out.println(this.nama+" "+this.alamat+" "+this.umur);
    }
}

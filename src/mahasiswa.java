public class mahasiswa {
    private string nama;
    private string alamat;
    private int umur;

    public void makan(){
        system.out.printIn(this.nama +"sedang makan");
    }

    public string getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    private string getNama(){
        return this.nama;
    }

    public void setNama(string nama) {
        this.nama = nama;
    }

    public void setAlamat(string alamat) {
        this.alamat = alamat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampil(){
        System.out.println(this.nama+""+this.alamat+""+this.umur);
    }
}

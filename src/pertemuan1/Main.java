package pertemuan1;

import pertemuan1.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Jaka Junaedi");
        mhs.setAlamat("Jakarta");
        mhs.setUmur(19);
        mhs.makan(); // methode makan //
        mhs.tampil(); // methode tampill //
    }
}

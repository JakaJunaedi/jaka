package pertemuan5;

// String length //
// String concat //
// String compareTo //
public class Main {
    public static void main(String[] args) {
        String budi = "Hallo nama saya budi tinggal dijakarta ";
        String andi = "Saya Andi";
        String joko = "Hallo nama saya budi tinggal dijakarta ";

        // String //
        System.out.print(budi);

        // length untuk menghitung panjang karakter sebuah string //
        System.out.println(budi.length());

        // concat untuk menggabungkan 2 variable //
        System.out.println(budi+"dan ".concat(andi));

        // compareTo merupakan penggabungan variable dengan value yang sama akan menghasilkan 0 //
        System.out.println(budi.compareTo(joko));

    }
}

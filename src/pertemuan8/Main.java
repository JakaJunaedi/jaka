package pertemuan8;

public class Main {
    public static void main(String[] args) {
        // Pengulangan angka menggunakan For//
        int angka; // variable angka //
        for(
                angka=0; // angka sama dengan 0 //
                angka<10; // jika nilai angka lebih kecil dari 10 //
                angka++ // maka tampilkan angka sbanyak 10 kali //
        ) {
            System.out.println("No urut for "+angka);
        }

        // Pengulangan number menggunakan While //
        int number=0; // variable number sama dengan 0 //
        while (number<10) { // jika number lebig kecil dari 10 //
            System.out.println("No Urut While "+number); // maka tampilkan //
            number++; // sama dengan 10 //
        }
    }
}

package pertemuan10;

import java.util.Scanner;

public class Siswa {
    public static void main(String[] args) {
        // membuat array siswa //
        String[] siswa = new String[5];
        // membuat scanner //
        Scanner scan = new Scanner(System.in);
        // mengisi data array //
        for (int i=0; i < siswa.length; i++) {
            System.out.println("Siswa ke- "+i +" : ");
            //siswa[i] = scan.nextLine();
        }

        // Menampilkan semua array yang diset //
        for( String b : siswa ){
            System.out.println(b);
        }

    }
}


package pertemuan9;

// Pengenalan Array //
// penulisan kurung siku [] bisa sesudah type data int/String atau sebelum
public class Main {
    public static void main(String[] args) {
        // penulisan array type data interger //
        int [] angka = {1,2,3,4};
        System.out.println(angka[2]+ " <--------Array Dengan type data integer");

        // penulisan array type data string 1 //
        String huruf [] = {"Budi", "Andi", "Rahmat"};
        System.out.println(huruf[1]+ " <-----Aray Dengan type data String");

        System.out.println("##### Array dengan type data String dan perulangan menngunakan For #####");
        //pengulangan array menggunakan for //
        String nama [] = {"Iman", "Ipap", "Adip"};
        for (int tes =0; tes<nama.length; tes++) {
            System.out.println("No "+tes+": "+nama[tes]);
        }
    }
}

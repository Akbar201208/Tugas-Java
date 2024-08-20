import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        double awalHarga, diskon, jumlahBarang, akhirHarga;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan harga barang: ");
        awalHarga = scan.nextDouble();
        System.out.println("Masukkan persen diskon: ");
        diskon = scan.nextDouble();  
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlahBarang = scan.nextDouble();
        
        akhirHarga = (awalHarga - (awalHarga*diskon/100))*jumlahBarang;
        System.out.println("Harga akhir setelah diskon: " + akhirHarga);
    }
}


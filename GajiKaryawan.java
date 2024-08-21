import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        int jamKerja;
        double pajak, tarifJam;
        double gajiBersih, gajiKotor;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jam Kerja: ");
        jamKerja = scan.nextInt();
        System.out.print("Masukkan Tarif Per Jam: ");
        tarifJam = scan.nextDouble();

        gajiKotor = jamKerja * tarifJam;
        pajak = gajiKotor * 0.1;
        gajiBersih = gajiKotor - pajak;
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}

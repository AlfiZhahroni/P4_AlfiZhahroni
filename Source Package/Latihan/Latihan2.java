import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float persen_makan, persen_transport, persen_belanja;

        // Input data
        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextFloat();
        System.out.print("Masukkan pengeluaran transport: ");
        transport = input.nextFloat();
        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextFloat();

        // Proses perhitungan
        total = makan + transport + belanja;
        persen_makan = (makan / total) * 100;
        persen_transport = (transport / total) * 100;
        persen_belanja = (belanja / total) * 100;

        // Output hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Total pengeluaran     : %.2f\n", total);
        System.out.printf("Persen makan          : %.2f%%\n", persen_makan);
        System.out.printf("Persen transport      : %.2f%%\n", persen_transport);
        System.out.printf("Persen belanja        : %.2f%%\n", persen_belanja);
    }
}
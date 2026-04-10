public class Latihan3 {
    public static void main(String[] args) {
        // Data pengeluaran
        float makan = 35000;
        float transport = 20000;
        float belanja = 45000;
        float total, diskon, bayarAkhir;
        float persenDiskon = 10; // 10%

        // Proses
        total = makan + transport + belanja;
        diskon = total * persenDiskon / 100;
        bayarAkhir = total - diskon;

        // Output hasil
        System.out.println("--- Hasil Perhitungan ---");
        System.out.printf("Total pengeluaran      : %.2f\n", total);
        System.out.printf("Besar diskon (10%%)     : %.2f\n", diskon);
        System.out.printf("Total pembayaran akhir : %.2f\n", bayarAkhir);
    }
}
import java.util.Scanner;

public class Bank09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jumlah_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga,jumlah_tabungan_akhir;

        System.out.println("Masukkan tabungan awal anda");
        jumlah_tabungan_awal= sc.nextInt();
        System.out.println("Berapa lama anda menabung");
        lama_menabung = sc.nextInt();
        bunga = lama_menabung*prosentase_bunga*jumlah_tabungan_awal;
        jumlah_tabungan_akhir = bunga+jumlah_tabungan_awal;
        System.out.println("Bunga anda " + bunga);
        System.out.println("Jumlah tabungan anda sekarang adalah " + jumlah_tabungan_akhir);  
    }
}
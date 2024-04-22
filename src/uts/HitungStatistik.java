package uts;
import java.util.Scanner;
public class HitungStatistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bilangan, jumlahPositif = 0, jumlahNegatif = 0;
        double total = 0;
        int count = 0;
        
        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukan nilai 0:");
        
        do {
            bilangan = scanner.nextInt();
            if (bilangan > 0) {
                jumlahPositif++;
                total += bilangan;
                count++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
                total += bilangan;
                count++;
            }
        } while (bilangan != 0);
        
        // Menampilkan jumlah bilangan positif dan negatif
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        
        // Menghitung rata-rata dan menampilkan total dan rata-rata
        double rataRata = count > 0 ? total / count : 0;
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata adalah " + rataRata);
        
        scanner.close();
    }
    
}

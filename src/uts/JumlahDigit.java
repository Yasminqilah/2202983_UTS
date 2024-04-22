package uts;
import java.util.Scanner;
public class JumlahDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long bilangan = scanner.nextLong();
        
        int jumlahDigit = sumDigits(bilangan);
        
        System.out.println("Jumlah digit dalam bilangan " + bilangan + " adalah " + jumlahDigit);
        
        scanner.close();
    }
    
    // Metode untuk menghitung jumlah digit dalam bilangan bulat
    public static int sumDigits(long n) {
        int sum = 0;
        
        // Menggunakan loop untuk mengekstrak dan menghitung digit satu per satu
        while (n != 0) {
            // Mengambil digit terakhir dengan menggunakan operator %
            int digit = (int)(n % 10);
            // Menambahkan digit ke dalam jumlah total
            sum += digit;
            // Menghapus digit terakhir dengan menggunakan operator /
            n /= 10;
        }
        
        return sum;
    }
}

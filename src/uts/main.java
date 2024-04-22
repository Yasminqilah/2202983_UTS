package uts;

public class Main {
    public static void main(String[] args) {
        // Membuat objek limas segiempat pertama
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0);
        // Menampilkan informasi limas segiempat pertama
        System.out.println("Limas segi empat dengan luas alas : 1.0, luas selubung limas : 1.0 dan tinggi : 1.0. Luasnya : " + limas1.hitungLuas() + ", sedangkan volumenya : " + limas1.hitungVolume());
        
        // Membuat objek limas segiempat kedua
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 50.0);
        // Menampilkan informasi limas segiempat kedua
        System.out.println("Limas segi empat dengan luas alas : 30.0, luas selubung limas : 40.0 dan tinggi : 50.0. Luasnya : " + limas2.hitungLuas() + ", sedangkan volumenya : " + limas2.hitungVolume());
        
        // Membuat objek limas segiempat ketiga
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 45.0);
        // Menampilkan informasi limas segiempat ketiga
        System.out.println("Limas segi empat dengan luas alas : 25.0, luas selubung limas : 35.0 dan tinggi : 45.0. Luasnya : " + limas3.hitungLuas() + ", sedangkan volumenya : " + limas3.hitungVolume());
    }
}

package uts;

public class LimasSegiEmpat {
    private double luasAlas;
    private double tinggi;
    
    // Konstruktor
    public LimasSegiEmpat(double luasAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.tinggi = tinggi;
    }
    
    // Metode untuk menghitung luas selubung limas
    public double hitungLuasSelubung() {
        // Rumus luas selubung limas pada limas segiempat: L = s * (s + 2 * tinggi)
        double s = Math.sqrt(luasAlas);
        double luasSelubung = s * (s + 2 * tinggi);
        return luasSelubung;
    }
    
    // Metode untuk menghitung volume limas segiempat
    public double hitungVolume() {
        // Rumus volume limas segiempat: V = 1/3 x luas alas x tinggi
        double volume = (1.0/3.0) * luasAlas * tinggi;
        return volume;
    }
    
    // Metode untuk menghitung luas limas segiempat
    public double hitungLuas() {
        // Rumus luas limas segiempat: L = luas alas + luas selubung
        double luasSelubung = hitungLuasSelubung();
        double luas = luasAlas + luasSelubung;
        return luas;
    }
}

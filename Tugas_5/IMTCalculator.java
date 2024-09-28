/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author afifa
 */
public class IMTCalculator {
    private double beratBadan;
    private double tinggiBadan;

    // Constructor
    public IMTCalculator(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    // Method untuk menghitung IMT
    public double hitungIMT() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Method untuk menentukan kategori berdasarkan nilai IMT
    public String tentukanKategori() {
        double imt = hitungIMT();
        if (imt < 18.5) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}
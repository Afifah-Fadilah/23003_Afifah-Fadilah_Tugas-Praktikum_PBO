/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author afifa
 */
import java.util.Scanner;

public class IMTMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan (kg) dan tinggi badan (m)
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Buat objek IMTCalculator dan hitung IMT serta kategori
        IMTCalculator calculator = new IMTCalculator(beratBadan, tinggiBadan);
        
        // Output hasil IMT dan kategorinya
        System.out.printf("Nilai IMT: %.2f\n", calculator.hitungIMT());
        System.out.println("Kategori: " + calculator.tentukanKategori());
    }
}
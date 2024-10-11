/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author afifa
 */
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===================================");
            System.out.println("         Pilihan Program");
            System.out.println("===================================");
            System.out.println("1. Bilangan Prima dan Non Prima");
            System.out.println("2. Deret dari Z ke A");
            System.out.println("3. Bilangan Ganjil dan Genap");
            System.out.println("4. Lagu Anak Ayam");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan (0-4): ");
            choice = pilihan.nextInt();

            switch (choice) {
                case 1:
                    BilanganPrima.main(null); // Memanggil class BilanganPrima
                    break;
                case 2:
                    DeretZA.main(null); // Memanggil class DeretZA
                    break;
                case 3:
                    GanjilGenap.main(null); // Memanggil class GanjilGenap
                    break;
                case 4:
                    AnakAyam.main(null); // Memanggil class AnakAyam
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);

        pilihan.close();
    }
}
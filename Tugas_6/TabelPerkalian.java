/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author afifa
 */
import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class TabelPerkalian { // Membuat kelas bernama TabelPerkalian untuk menampilkan tabel perkalian

    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("\tTabel Perkalian");
        System.out.println("===================================");
        
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input
        int n; // Deklarasi variabel untuk menyimpan nilai n

        // Meminta pengguna memasukkan nilai n
        do {
            System.out.print("Masukkan nilai n (kurang dari atau sama dengan 10): "); // Menampilkan pesan untuk meminta input
            n = input.nextInt(); // Membaca nilai n dari pengguna
        } while (n > 10); // Mengulang jika n lebih besar dari 10

        // Menampilkan tabel perkalian
        System.out.println("Tabel Perkalian " + n + " x " + n + ":"); // Menampilkan judul tabel
        int i = 1; // Inisialisasi variabel i untuk iterasi baris

        do {
            int j = 1; // Inisialisasi variabel j untuk iterasi kolom
            while (j <= n) { // Loop untuk kolom
                System.out.print(i * j + "\t"); // Menghitung dan mencetak hasil perkalian i dan j
                j++; // Menaikkan nilai j
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris
            i++; // Menaikkan nilai i untuk baris berikutnya
        } while (i <= n); // Mengulang hingga i mencapai n

        input.close(); // Menutup objek Scanner untuk menghindari kebocoran memori
    }
}
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

public class TabelPerkalian {

    public void tampilkanTabel(int n) { 
        // Menampilkan tabel perkalian
        System.out.println("Tabel Perkalian " + n + " x " + n + ":"); 
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
    }

    public int ambilInput(Scanner input) {
        int n; // Deklarasi variabel untuk menyimpan nilai n

        // Meminta pengguna memasukkan nilai n
        do {
            System.out.print("Masukkan nilai n (kurang dari atau sama dengan 10): "); // Menampilkan pesan untuk meminta input
            n = input.nextInt(); // Membaca nilai n dari pengguna
        } while (n > 10); // Mengulang jika n lebih besar dari 10

        return n;
    }
}
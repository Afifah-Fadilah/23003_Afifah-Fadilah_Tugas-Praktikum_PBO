/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author afifa
 */
public class GanjilGenap { // Membuat class bernama GanjilGenap untuk menampilkan deret bilangan genap dan ganjil

    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("    Bilangan Ganjil dan Genap");
        System.out.println("===================================");
        
        // Menampilkan deret bilangan genap dari 0 hingga 20
        System.out.println("Deret Bilangan Genap dari 0 - 20:");
        int i = 0; // Inisialisasi variabel i dengan 0 untuk menghitung bilangan genap
        do { // Loop selama i kurang dari atau sama dengan 20
            if (i % 2 == 0) { // jika i dapat dibagi 2 dan menghasilkan 0, maaka akan mencetak bilangan genap
                System.out.print(i + " "); // Mencetak bilangan genap
            }
            i++; // Menaikkan nilai i
        }while(i <= 20);

        // Menampilkan deret bilangan ganjil dari 0 hingga 20
        System.out.println("\nDeret Bilangan Ganjil dari 0 - 20:");
        i = 1; // Inisialisasi variabel i dengan 1 untuk menghitung bilangan ganjil
        do {
            if (i % 2 != 0) { // jika i tidak dapat dibagi 2 dan menghasilkan 0, maka akan mencetak bilangan ganjil
                System.out.print(i + " "); // Mencetak bilangan ganjil
            }
            i++; // Menaikkan nilai i
        } while (i <= 20); // Loop selama i kurang dari atau sama dengan 20

        System.out.println(); // Pindah ke baris baru setelah mencetak semua bilangan
    }
}

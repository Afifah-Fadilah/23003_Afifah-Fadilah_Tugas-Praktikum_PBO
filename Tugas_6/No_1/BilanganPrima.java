/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author afifa
 */
public class BilanganPrima { // Membuat class bernama BilanganPrima untuk mencari bilangan prima dan bukan prima
    
    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("   Bilangan Prima dan Non Prima");
        System.out.println("===================================");
        
        // Menampilkan deret bilangan prima dari 0 hingga 20
        System.out.println("Deret Bilangan Prima dari 0 - 20:");
        for (int i = 2; i <= 20; i++) { // Perulangan untuk angka dari 2 hingga 20
            boolean isPrime = true; // Anggap awalnya bilangan tersebut adalah prima

            // Cek apakah angka i memiliki faktor selain 1 dan dirinya sendiri
            for (int j = 2; j < i; j++) { // Loop untuk memeriksa faktor
                if (i % j == 0) { // Jika i habis dibagi j (ada faktor)
                    isPrime = false; // Menandakan bahwa i bukan bilangan prima
                    break; // Keluar dari loop karena sudah terbukti bukan prima
                }
            }

            // Jika i adalah bilangan prima, cetak i
            if (isPrime) {
                System.out.print(i + " "); // Cetak bilangan prima
            }
        }

        // Menampilkan deret bilangan bukan prima dari 0 hingga 20
        System.out.println("\nDeret Bilangan Bukan Prima dari 0 - 20:");
        for (int i = 2; i <= 20; i++) { // Perulangan untuk angka dari 2 hingga 20
            boolean isPrime = true; // Anggap awalnya bilangan tersebut adalah prima

            // Cek apakah angka i memiliki faktor selain 1 dan dirinya sendiri
            for (int j = 2; j < i; j++) { // Loop untuk memeriksa faktor
                if (i % j == 0) { // Jika i habis dibagi j (ada faktor)
                    isPrime = false; // Menandakan bahwa i bukan bilangan prima
                    break; // Keluar dari loop karena sudah terbukti bukan prima
                }
            }

            // Jika i bukan bilangan prima, cetak i
            if (!isPrime) { // Memeriksa kondisi kebalikan dari isPrime
                System.out.print(i + " "); // Cetak bilangan bukan prima
            }
        }
        System.out.println(); // Pindah ke baris baru setelah mencetak semua bilangan
    }
}
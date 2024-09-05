/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author afifa
 */
public class Bingo {

    // Method untuk mencetak satu bait lagu berdasarkan jumlah tepukan
    public void printVerse(int claps) {
        String bingo = "B-I-N-G-O";

        // Mencetak baris pertama
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Mencetak B-I-N-G-O dengan atau tanpa tepukan
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < claps) {
                    System.out.print("(clap)"); // Mengganti huruf dengan "clap"
                } else {
                    System.out.print(bingo.charAt(2 * j)); // Mencetak huruf B, I, N, G, O
                }
                if (j < 4) {
                    System.out.print("-"); // Menyisipkan tanda "-" di antara huruf
                }
            }
            System.out.println();  // Pindah ke baris baru setelah mencetak satu baris
        }

        // Mencetak baris terakhir
        System.out.println("And Bingo was his name-o.");
    }

    // Method untuk mencetak keseluruhan lagu
    public void printSong() {
        // Looping untuk mencetak bait dengan jumlah tepukan yang bertambah
        for (int i = 0; i <= 5; i++) {
            printVerse(i);
            System.out.println(); // Baris kosong sebagai pemisah antar bait
        }
    }
}

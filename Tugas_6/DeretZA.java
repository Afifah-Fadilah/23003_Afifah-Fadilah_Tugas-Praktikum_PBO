/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author afifa
 */
public class DeretZA { // Membuat class bernama DeretZA untuk mengurutkan deret huruf dari Z sampai A secara mundur

    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("\tDeret dari Z ke A");
        System.out.println("===================================");
        
        System.out.println("Deret Huruf Z - A:"); // Menampilkan judul deret huruf

        // Deret Huruf Z - A menggunakan loop for
        for (char c = 'Z'; c >= 'A'; c--) { // Memulai dari 'Z' hingga 'A', c-- untuk mundur
            System.out.print(c + " "); // Mencetak karakter c diikuti dengan spasi
        }
        System.out.println(); // Pindah ke baris baru setelah mencetak semua huruf
    }
}
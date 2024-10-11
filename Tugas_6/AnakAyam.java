/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author afifa
 */
import java.util.Scanner; //mengimport scanner untuk menginputkan data

public class AnakAyam { //membuat class untuk membuat perulangan dari lagu anak ayam

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //inisialisasi nama scanner
        
        System.out.println("===================================");
        System.out.println("\tLagu Anak Ayam");
        System.out.println("===================================");
        
        // Meminta input jumlah anak ayam dari user
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = input.nextInt(); //membuat var untuk menyimpan pilihan input yaitu n

        // Lagu Anak Ayam Turun N
        while (n > 0) { //menggunakan perulangan while, akan terus berjalan selama n diatas 0.
            if (n == 1) { //jika n = 0, maka akan menjalankan program ini
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya.");
            } else { //apabila n masih diatas 1, maka akan terus menjalankan program ini sampai n = 1
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1) + ".");
            }
            n--; // Mengurangi jumlah anak ayam
        }

        input.close(); //menutup scanner
    }
}
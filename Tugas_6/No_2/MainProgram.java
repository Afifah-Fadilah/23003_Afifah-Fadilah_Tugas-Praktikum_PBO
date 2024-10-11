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

public class MainProgram {

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("\tTabel Perkalian");
        System.out.println("===================================");

        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input
        TabelPerkalian tabel = new TabelPerkalian(); // Membuat objek dari kelas TabelPerkalian
        
        int n = tabel.ambilInput(input); // Ambil input dari pengguna melalui kelas TabelPerkalian
        tabel.tampilkanTabel(n); // Tampilkan tabel perkalian berdasarkan input pengguna

        input.close(); // Menutup objek Scanner setelah selesai
    }
}
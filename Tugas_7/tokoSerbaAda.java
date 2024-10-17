/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author afifa
 */
import java.util.Scanner;  // Import Scanner untuk menerima input dari pengguna

public class tokoSerbaAda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Membuat objek Scanner untuk menerima input

        // Membuat daftar barang dengan kode, nama, dan harga
        barang[] daftarBarang = {
            new barang("a001", "Buku", 3000),
            new barang("a002", "Pensil", 4000),
            new barang("a003", "Pulpen", 5000)
        };

        // Array untuk menyimpan kode barang yang dibeli dan jumlah pembeliannya
        String[] kodeBarang = new String[10];  // Menyimpan maksimal 10 transaksi
        int[] jumlahBeli = new int[10];  // Menyimpan jumlah beli untuk setiap barang
        int totalBayar = 0;  // Variabel untuk menghitung total pembayaran dengan total awal 0 

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*********************************");
        
        // Meminta input jumlah item yang akan dibeli dari pengguna
        System.out.print("Masukkan Item Barang: ");
        // Menggunakan nextInt untuk membaca input angka (jumlah barang yang dibeli)
        int jumlahItem = input.nextInt();

        // Loop untuk input data transaksi berdasarkan jumlah item yang diinput pengguna
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));  // Menampilkan urutan data ke berapa dimulai dari 1 karena i+1

            // Meminta input kode barang yang dibeli
            System.out.print("Masukkan Kode       : ");
            kodeBarang[i] = input.next();  // Menggunakan next() untuk input kode barang (string)

            // Meminta input jumlah barang yang dibeli
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();  // Menggunakan nextInt() untuk input angka (jumlah barang yang dibeli)
        }

        // Output daftar transaksi
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*********************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");

        // Loop untuk menampilkan dan menghitung data transaksi berdasarkan input pengguna
        for (int i = 0; i < jumlahItem; i++) {
            for (barang barang : daftarBarang) {  // Loop untuk mencari barang berdasarkan kode
                if (kodeBarang[i].equals(barang.getKode())) {  // Jika kode barang cocok, menggunakan equals karena menggunakan string
                    String namaBarang = barang.getNama();  // Mengambil nama barang
                    int hargaBarang = barang.getHarga();  // Mengambil harga barang
                    int jumlahBayar = hargaBarang * jumlahBeli[i];  // Menghitung jumlah bayar per item
                    totalBayar += jumlahBayar;  // Menambahkan jumlah bayar ke total bayar

                    // Menampilkan output data transaksi per item
                    System.out.printf("%-3d %-12s %-12s %-11d %-11d %-11d\n",
                            (i + 1), kodeBarang[i], namaBarang, hargaBarang, jumlahBeli[i], jumlahBayar);
                }
            }
        }

        // Output total pembayaran akhir
        System.out.println("==============================================================");
        System.out.println("Total Bayar                                           " + totalBayar);
        System.out.println("==============================================================");

        input.close();  // Menutup Scanner untuk menghemat sumber daya
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author afifa
 */
import java.util.Scanner; //agar user dapat menginputkan nilai 

public class PembelianMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //inisialisasi scanner bernama input
        double totalHarga = 0; // Variabel untuk menyimpan total harga
        boolean selesai = false; // Flag untuk mengakhiri pembelian

        while (!selesai) { //terus berulang hingga selesai bernilai true
            // Menampilkan menu
            System.out.println("========== Menu Ice Cream ==========");
            System.out.println("1. Vanilla Ice Cream     (Rp. 10.000)");
            System.out.println("2. Chocolate Ice Cream   (Rp. 14.000)");
            System.out.println("3. Strawberry Ice Cream  (Rp. 15.000)");
            System.out.println("4. Mango Ice Cream       (Rp. 16.000)");
            System.out.println("0. Selesai dan hitung total");
            System.out.println("====================================");


            // Input pilihan dari user
            System.out.print("Pilih menu (0-4): ");
            int pilihan = input.nextInt(); //bertipe integer

            // Harga berdasarkan pilihan
            double harga = 0; //inisiasi harga awal adalah 0

            switch (pilihan) { //pengkondisian menurut inputan dari user
                case 1: //apabila user input 1, maka akan menjalankan kode di bawah, begitu pun case selanjutnya
                    harga = 10000;
                    System.out.println("Anda memilih Vanilla Ice Cream.");
                    break;
                case 2:
                    harga = 14000;
                    System.out.println("Anda memilih Chocolate Ice Cream.");
                    break;
                case 3:
                    harga = 15000;
                    System.out.println("Anda memilih Strawberry Ice Cream.");
                    break;
                case 4:
                    harga = 16000;
                    System.out.println("Anda memilih Mango Ice Cream.");
                    break;
                case 0: //di case 0, selesai menjadi true, yang artinya while berhenti dan akan berlanjut ke baris kode diluar looping
                    selesai = true;
                    System.out.println("Terima kasih!");
                    continue; // Langsung melompat ke akhir perulangan jika user selesai
                default:
                    System.out.println("Pilihan tidak valid."); //apabila user salah input
                    break;
                    
            }

            // Tambah harga item ke totalHarga
            totalHarga += harga;

            System.out.println("Total harga sementara: Rp. " + totalHarga); //membuat total harga sementara
            System.out.println();
        }

        // Jika ada pembelian, hitung diskon dan total pembayaran
        if (totalHarga > 0) {
            Pembelian iceCream = new Pembelian(totalHarga);

            // Menghitung diskon dan total yang harus dibayar
            double diskon = iceCream.hitungDiskon();
            double totalBayar = iceCream.totalPembayaran();

            // output hasil perhitungan pembelian dan diskon nya
            System.out.println("\n========= Total Pembelian =========");
            System.out.println("Total pembelian Rp.        " + totalHarga);
            System.out.println("Besarnya potongan Rp.      " + diskon);
            System.out.println("Total Harga Rp.            " + totalBayar);
            System.out.println("===================================");

        } else { //jika tidak ada pembelian maka akan tampil seperti di bawah
            System.out.println("------------------------------");
            System.out.println("Anda tidak membeli apapun.");
        }
    }
}
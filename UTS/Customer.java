/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemReservasiHotel;

/**
 *
 * @author afifa
 */

import Hotel.Kamar; //mengimpor kelas kamar di package hotel ke kelas customer di package ini 
import Hotel.Pesanan; //mengimpor kelas Pesanan di package hotel ke kelas customer di package ini 
import java.util.Scanner; //mengimpor scanner agar user dapat meginputkan data

public class Customer {
    private Kamar[] kamarArray; // Array untuk menyimpan daftar kamar
    private Pesanan pesanan = null; // Objek pesanan untuk menyimpan detail pemesanan

    // Konstruktor untuk menginisialisasi daftar kamar
    public Customer(Kamar[] kamarArray) {
        this.kamarArray = kamarArray;
    }

    // Metode untuk menampilkan menu bagi customer
    public void menuCustomer(Scanner input) {
        int pilihan;

        // Loop untuk menampilkan menu hingga pengguna memilih untuk keluar
        do {
            System.out.println("===================================");
            System.out.println("|           Menu Customer         |");
            System.out.println("===================================");
            System.out.println("1. Lihat Kamar");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            // Menggunakan switch untuk menentukan aksi berdasarkan pilihan
            switch (pilihan) {
                case 1:
                    lihatKamar(); // Tampilkan daftar kamar
                    break;
                case 2:
                    pesanKamar(input); // Proses pemesanan kamar
                    break;
                case 3:
                    lihatPesanan(); // Tampilkan detail pesanan
                    break;
                case 4:
                    System.out.println("Keluar dari menu customer."); // Keluar dari menu
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi."); // Pesan error untuk pilihan yang tidak valid
            }
        } while (pilihan != 4); // Ulangi hingga pilihan 4 dipilih
    }

    // Metode untuk menampilkan daftar kamar yang tersedia
    private void lihatKamar() {
        System.out.println("===================================");
        System.out.println("|          Daftar Kamar           |");
        System.out.println("===================================");
        for (int i = 0; i < kamarArray.length; i++) {
            if (kamarArray[i] != null) {
                kamarArray[i].tampilkanInfo(); // Tampilkan informasi masing-masing kamar
            }
        }
    }

    // Metode untuk memproses pemesanan kamar
    private void pesanKamar(Scanner input) {
        System.out.println("===================================");
        System.out.println("|          Pesan Kamar            |");
        System.out.println("===================================");
        // Mengumpulkan informasi dari pengguna untuk pemesanan
        System.out.print("Masukkan nama pemesan: ");
        input.nextLine(); 
        String namaPemesan = input.nextLine();

        System.out.print("Masukkan nomor KTP: ");
        String nomorKTP = input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamatPemesan = input.nextLine();

        System.out.print("Masukkan tanggal check-in (dd-mm-yyyy): ");
        String tanggalCheckIn = input.nextLine();

        System.out.print("Masukkan jam check-in (hh:mm): ");
        String jamCheckIn = input.nextLine();

        // Menampilkan kamar yang tersedia untuk pemesanan
        System.out.println("===================================");
        System.out.println("|         Pilihan Kamar           |");
        System.out.println("===================================");
        for (int i = 0; i < kamarArray.length; i++) {
            if (kamarArray[i] != null && kamarArray[i].tersedia) {
                System.out.println((i + 1) + ". " + kamarArray[i].namaKamar); // Menampilkan nama kamar yang tersedia
            }
        }

        // Mengumpulkan nomor kamar yang ingin dipesan
        System.out.print("Masukkan nomor kamar yang ingin dipesan (1-" + kamarArray.length + "): ");
        int nomorKamar = input.nextInt();

        // Validasi nomor kamar dan ketersediaan
        if (nomorKamar < 1 || nomorKamar > kamarArray.length || kamarArray[nomorKamar - 1] == null || !kamarArray[nomorKamar - 1].tersedia) {
            System.out.println("Kamar tidak tersedia."); // Pesan jika kamar tidak tersedia
            return;
        }

        Kamar kamarDipilih = kamarArray[nomorKamar - 1]; // Menyimpan kamar yang dipilih
        System.out.print("Masukkan durasi (hari): ");
        int durasiHari = input.nextInt(); // Mengumpulkan durasi pemesanan

        double totalHarga = kamarDipilih.hargaKamar * durasiHari; // Menghitung total harga
        pesanan = new Pesanan(namaPemesan, nomorKTP, kamarDipilih, durasiHari, totalHarga, alamatPemesan, tanggalCheckIn, jamCheckIn); // Membuat objek pesanan
        System.out.println("Pesanan berhasil dibuat! Total harga: " + totalHarga);

        // Menanyakan apakah ingin melakukan pembayaran
        System.out.print("Lakukan pembayaran? (yes/no): ");
        String pembayaran = input.next();
        if (pembayaran.equalsIgnoreCase("yes")) {
            pesanan.setPaid(true); // Mengubah status pembayaran
            kamarDipilih.setTersedia(false); // Kamar tidak tersedia setelah pembayaran
            System.out.println("Pembayaran berhasil. Kamar telah dipesan.");
        } else {
            System.out.println("Pembayaran dibatalkan."); // Pembatalan pembayaran
        }
    }

    // Metode untuk menampilkan detail pesanan
    private void lihatPesanan() {
        if (pesanan != null) {
            System.out.println("===================================");
            System.out.println("          Detail Pesanan          ");
            System.out.println("===================================");
            System.out.println("Nama Pemesan: " + pesanan.getNamaPemesan());
            System.out.println("Nomor KTP: " + pesanan.getNomorKTP());
            System.out.println("Alamat: " + pesanan.getAlamatPemesan());
            System.out.println("Kamar: " + pesanan.getKamar().namaKamar);
            System.out.println("Durasi: " + pesanan.getDurasiHari() + " hari");
            System.out.println("Total Harga: " + pesanan.getTotalHarga());
            System.out.println("Tanggal Check-in: " + pesanan.getTanggalCheckIn());
            System.out.println("Jam Check-in: " + pesanan.getJamCheckIn());
            System.out.println("Status Pembayaran: " + (pesanan.isPaid() ? "Sudah dibayar" : "Belum dibayar")); // Menampilkan status pembayaran
        } else {
            System.out.println("Anda belum melakukan pemesanan."); // Pesan jika belum ada pemesanan
        }
    }
}
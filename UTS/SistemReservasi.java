/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemReservasiHotel;

/**
 *
 * @author afifa
 */


import Hotel.Kamar; //mengimpor kelas dari kelas kamar package hotel ke kelas ini
import java.util.ArrayList; //mengimpor array untuk membuat array
import java.util.Scanner; //mengimpor scanner untuk user dapat menginputkan pilihan

public class SistemReservasi {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan daftar kamar
        ArrayList<Kamar> kamarList = new ArrayList<>();
        
        // Inisialisasi kamar dengan detail dan menambahkannya ke dalam daftar
        kamarList.add(new Kamar("Silver Room", 500000, "Full fasilitas, view pekampungan", 10));
        kamarList.add(new Kamar("Golden Room", 600000, "Full fasilitas, view city light", 5));
        kamarList.add(new Kamar("Deluxe Room", 700000, "Full fasilitas, view pegunungan", 3));

        // Mengonversi ArrayList menjadi array untuk digunakan dalam sistem
        Kamar[] kamarArray = kamarList.toArray(new Kamar[0]);

        // Membuat objek Admin dan Customer dengan daftar kamar yang sama
        Admin admin1 = new Admin(kamarArray);
        Customer customer = new Customer(kamarArray);

        Scanner input = new Scanner(System.in); // Scanner untuk input pengguna
        int login; // Variabel untuk menyimpan pilihan login

        // Loop untuk menampilkan menu login hingga pengguna memilih untuk keluar
        do {
            System.out.println("===================================");
            System.out.println("|          Hotel Apipah           |");
            System.out.println("===================================");
            System.out.println("Login sebagai:\n1. Admin\n2. Customer\n3. Keluar");
            System.out.println("===================================");
            login = input.nextInt(); // Mengumpulkan pilihan login dari pengguna

            // Menggunakan switch untuk menentukan aksi berdasarkan pilihan login
            switch (login) {
                case 1:
                    admin1.login(input); // Memanggil metode login untuk admin
                    break;
                case 2:
                    customer.menuCustomer(input); // Memanggil metode menu untuk customer
                    break;
                case 3:
                    System.out.println("Keluar dari sistem."); // Pesan keluar
                    break;
                default:
                    System.out.println("Pilihan tidak valid."); // Pesan jika pilihan tidak valid
            }
        } while (login != 3); // Ulangi hingga pilihan 3 dipilih
    }
}
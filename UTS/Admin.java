/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemReservasiHotel;

/**
 *
 * @author afifa
*/
import Hotel.Kamar; // Mengimpor kelas Kamar dari package Hotel
import java.util.Scanner; // Mengimpor kelas Scanner untuk input pengguna

public class Admin {
    private static int passwordAdmin = 111222; // Password untuk akses admin
    private Kamar[] kamarList; // Array untuk menyimpan daftar kamar

    // Konstruktor untuk menginisialisasi objek Admin dengan daftar kamar
    public Admin(Kamar[] kamarList) {
        this.kamarList = kamarList; // Mengatur kamarList dengan parameter yang diberikan
    }

    // Metode untuk login sebagai admin
    public void login(Scanner input) {
        System.out.println("===================================");
        System.out.println("|          Login Admin            |");
        System.out.println("===================================");
        System.out.print("Masukkan password: "); // Meminta password dari pengguna
        int pw = input.nextInt(); // Membaca input password
        System.out.println("===================================");

        // Memeriksa apakah password yang dimasukkan benar
        if (pw == passwordAdmin) {
            System.out.println("\n!! Anda masuk sebagai admin !!");
            int pilih; // Variabel untuk menyimpan pilihan menu

            do {
                // Menampilkan menu pilihan admin
                System.out.println("===================================");
                System.out.println("|           Menu Admin            |");
                System.out.println("===================================");
                System.out.println("1. Tambah Kamar\n2. Edit Kamar\n3. Lihat Kamar\n4. Keluar");
                pilih = input.nextInt(); // Membaca pilihan pengguna
                System.out.println("========================================");

                // Menggunakan switch untuk menangani pilihan menu
                switch (pilih) {
                    case 1:
                        tambahKamar(input); // Memanggil metode untuk menambah kamar
                        break;
                    case 2:
                        editKamar(input); // Memanggil metode untuk mengedit kamar
                        break;
                    case 3:
                        lihatKamar(); // Memanggil metode untuk melihat daftar kamar
                        break;
                    case 4:
                        System.out.println("Keluar dari menu admin."); // Menampilkan pesan keluar
                        break;
                    default:
                        System.out.println("Pilihan tidak valid."); // Menampilkan pesan jika pilihan tidak valid
                }
            } while (pilih != 4); // Mengulang hingga pengguna memilih untuk keluar
        } else {
            System.out.println("Password salah."); // Menampilkan pesan jika password salah
        }
    }

    // Metode untuk menambah kamar baru
    private void tambahKamar(Scanner input) {
        System.out.println("===================================");
        System.out.println("|          Tambah Kamar           |");
        System.out.println("===================================");
        System.out.print("Masukkan nama kamar: ");
        input.nextLine(); // Membersihkan buffer
        String namaKamar = input.nextLine(); // Membaca nama kamar

        System.out.print("Masukkan harga kamar: ");
        double hargaKamar = input.nextDouble(); // Membaca harga kamar

        System.out.print("Masukkan deskripsi kamar: ");
        input.nextLine(); // Membersihkan buffer
        String deskripsiKamar = input.nextLine(); // Membaca deskripsi kamar

        System.out.print("Masukkan jumlah kamar: ");
        int jumlahKamar = input.nextInt(); // Membaca jumlah kamar
        System.out.println("==========================================");
        
        // Membuat objek Kamar baru dan mencari tempat kosong dalam kamarList
        Kamar kamarBaru = new Kamar(namaKamar, hargaKamar, deskripsiKamar, jumlahKamar);
        for (int i = 0; i < kamarList.length; i++) {
            if (kamarList[i] == null) { // Cari tempat kosong
                kamarList[i] = kamarBaru; // Menambahkan kamar baru ke kamarList
                System.out.println("Kamar berhasil ditambahkan!"); // Menampilkan pesan berhasil
                return; // Menghentikan metode setelah menambah kamar
            }
        }
        System.out.println("Tidak dapat menambahkan kamar, daftar kamar sudah penuh."); // Menampilkan pesan jika kamarList penuh
    }

    // Metode untuk mengedit kamar yang sudah ada
    private void editKamar(Scanner input) {
        System.out.println("===================================");
        System.out.println("|         Menu Edit Kamar         |");
        System.out.println("===================================");

        System.out.println("Daftar Kamar:"); // Menampilkan daftar kamar
        for (int i = 0; i < kamarList.length; i++) {
            if (kamarList[i] != null) {
                System.out.println((i + 1) + ". " + kamarList[i].namaKamar); // Menampilkan nama kamar
            }
        }

        System.out.print("Masukkan nomor kamar yang ingin diedit (1-" + kamarList.length + "): ");
        int nomorKamar = input.nextInt(); // Membaca nomor kamar yang ingin diedit

        // Memeriksa apakah nomor kamar valid
        if (nomorKamar < 1 || nomorKamar > kamarList.length || kamarList[nomorKamar - 1] == null) {
            System.out.println("Nomor kamar tidak valid."); // Menampilkan pesan jika nomor tidak valid
            return; // Menghentikan metode
        }

        // Menyimpan referensi kamar yang dipilih
        Kamar kamarDipilih = kamarList[nomorKamar - 1];
        System.out.println("Kamar yang dipilih: " + kamarDipilih.namaKamar); // Menampilkan kamar yang dipilih
        System.out.println("Harga: " + kamarDipilih.hargaKamar);
        System.out.println("Deskripsi Kamar: " + kamarDipilih.deskripsiKamar);
        System.out.println("Status: " + (kamarDipilih.tersedia ? "Tersedia" : "Tidak Tersedia"));

        // Menampilkan opsi untuk mengedit atribut kamar
        System.out.println("Pilih atribut yang ingin diubah:");
        System.out.println("1. Ubah nama kamar");
        System.out.println("2. Ubah harga kamar");
        System.out.println("3. Ubah deskripsi kamar");
        System.out.println("4. Ubah status ketersediaan");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihanEdit = input.nextInt(); // Membaca pilihan edit
        input.nextLine(); // Membersihkan buffer

        // Menggunakan switch untuk menangani pilihan edit
        switch (pilihanEdit) {
            case 1:
                System.out.print("Ubah nama kamar (tekan enter jika tidak ingin mengubah): ");
                String namaBaru = input.nextLine(); // Membaca nama baru
                if (!namaBaru.isEmpty()) {
                    kamarDipilih.namaKamar = namaBaru; // Mengubah nama kamar jika tidak kosong
                }
                break;

            case 2:
                System.out.print("Ubah harga kamar (tekan enter jika tidak ingin mengubah): ");
                String hargaBaruInput = input.nextLine(); // Membaca input harga baru
                if (!hargaBaruInput.isEmpty()) {
                    kamarDipilih.hargaKamar = Double.parseDouble(hargaBaruInput); // Mengubah harga kamar
                }
                break;

            case 3:
                System.out.print("Ubah deskripsi kamar (tekan enter jika tidak ingin mengubah): ");
                String deskripsiBaru = input.nextLine(); // Membaca deskripsi baru
                if (!deskripsiBaru.isEmpty()) {
                    kamarDipilih.deskripsiKamar = deskripsiBaru; // Mengubah deskripsi kamar
                }
                break;

            case 4:
                System.out.print("Ubah status ketersediaan (true/false): ");
                boolean statusBaru = input.nextBoolean(); // Membaca status baru
                kamarDipilih.setTersedia(statusBaru); // Mengubah status ketersediaan
                break;

            default:
                System.out.println("Pilihan tidak valid."); // Menampilkan pesan jika pilihan tidak valid
                break;
        }

        System.out.println("Kamar berhasil diperbarui!"); // Menampilkan pesan jika kamar berhasil diperbarui
    }

    // Metode untuk melihat daftar kamar
    private void lihatKamar() {
        System.out.println("===================================");
        System.out.println("|         Daftar Kamar            |");
        System.out.println("===================================");
        for (Kamar kamar : kamarList) {
            if (kamar != null) {
                kamar.tampilkanInfo(); // Memanggil metode tampilkanInfo untuk menampilkan informasi kamar
            }
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author afifa
 */

//class kamar dibuat public agar dapat dipanggil di package lain
public class Kamar implements KamarInterface { //menyertakan fungsi-fungsi yang didefinisikan dalam interface
    // membuat Variabel untuk menyimpan informasi kamar
    public String namaKamar;
    public double hargaKamar;
    public String deskripsiKamar;
    public boolean tersedia; // Status ketersediaan kamar

    // membuat Konstruktor
    public Kamar(String namaKamar, double hargaKamar, String deskripsiKamar, int jumlahKamar) {
        this.namaKamar = namaKamar; // Inisialisasi nama kamar
        this.hargaKamar = hargaKamar; // Inisialisasi harga kamar
        this.deskripsiKamar = deskripsiKamar; // Inisialisasi deskripsi kamar
        this.tersedia = true; // Kamar otomatis tersedia saat dibuat
    }

    // Method untuk menampilkan informasi kamar yang mana override dari interface kamar
    @Override
    public void tampilkanInfo() { //untuk menampilkan detail kamar yang ada
        System.out.println("============== Detail Kamar ==============");
        System.out.println("Nama Kamar: " + namaKamar); //
        System.out.println("Harga Kamar: " + hargaKamar);
        System.out.println("Deskripsi Kamar: " + deskripsiKamar);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak Tersedia")); // Menampilkan status ketersediaan dari boolean
        System.out.println("==========================================");
    }

    // Method untuk mengubah status ketersediaan
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia; // Mengubah status ketersediaan
    }
}
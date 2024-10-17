/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author afifa
 */
public class barang {
    // Deklarasi atribut private untuk menyimpan data barang
    private String kodeBarang;  // Menyimpan kode barang
    private String namaBarang;  // Menyimpan nama barang
    private int hargaBarang;    // Menyimpan harga barang
    
    // Konstruktor untuk menginisialisasi objek 'barang' dengan kode, nama, dan harga
    public barang(String kodeBarang, String namaBarang, int hargaBarang) {
        this.kodeBarang = kodeBarang;  // Inisialisasi kode barang
        this.namaBarang = namaBarang;  // Inisialisasi nama barang
        this.hargaBarang = hargaBarang;  // Inisialisasi harga barang
    }

    // Getter untuk mengambil nilai kode barang
    public String getKode() {
        return kodeBarang;  // Mengembalikan nilai kode barang
    }
    
    // Getter untuk mengambil nilai nama barang
    public String getNama() {
        return namaBarang;  // Mengembalikan nilai nama barang
    }
    
    // Getter untuk mengambil nilai harga barang
    public int getHarga() {
        return hargaBarang;  // Mengembalikan nilai harga barang
    }
}
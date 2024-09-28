/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author afifa
 */
public class Pembelian {
    private double harga; // Membuat var untuk menyimpan harga ice cream

    // Constructor
    public Pembelian(double harga) { 
        this.harga = harga; //menginisilisasi var harga dengan nilai yang diberikan di class main 
    }

    // Getter untuk harga ice cream
    public double getHarga() {
        return harga; //mengembalikan nilai harga ice cream
    }

    // Method untuk menghitung diskon berdasarkan kriteria
    public double hitungDiskon() {
        if (harga < 50000) { //membuat pengkondisian dari pembelian ice cream
            return 0.05 * harga; // Diskon 5% apabila pembelian kurang dari 50 ribu
        } else {
            return 0.20 * harga; // Diskon 20% apabila pembelian lebih dari 50 ribu
        }
    }

    // Method untuk menghitung total yang harus dibayar
    public double totalPembayaran() {
        return harga - hitungDiskon(); // Total setelah diskon, yaitu harga asli - diskon
    }
}

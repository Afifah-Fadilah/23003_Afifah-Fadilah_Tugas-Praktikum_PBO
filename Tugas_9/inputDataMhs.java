/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author afifa
 */
import java.util.ArrayList; // Menggunakan ArrayList untuk menyimpan daftar mahasiswa yang terdaftar

public class inputDataMhs { //membuat kelas inputDataMhs berfungsi untuk mengelola data mahasiswa
    ArrayList <mahasiswa> listmahasiswa; // Deklarasi ArrayList untuk menyimpan objek mahasiswa
    
    public inputDataMhs(){ // Konstruktor untuk menginisialisasi ArrayList
        listmahasiswa = new ArrayList(); //inisialisasi arraylist untuk menyimpan data mahasiswa bernama listmahasiswa
    }
    
    // Membuat metode untuk menambahkan data mahasiswa baru ke dalam ArrayList
    public void insertData(String nim, String nama, String alamat, String mk, double nilaiAkhir){
        mahasiswa mhs = new mahasiswa(nim, nama, alamat, mk, nilaiAkhir); // Membuat objek mahasiswa baru dengan data yang diberikan
        listmahasiswa.add(mhs); // Menambahkan objek mahasiswa ke dalam listmahasiswa
    }
    
    // Membuat metode untuk mengambil seluruh data mahasiswa dalam bentuk ArrayList
    public ArrayList<mahasiswa>getALL(){ 
        return listmahasiswa; // Mengembalikan daftar mahasiswa yang tersimpan
    }
    
    // Metode untuk menghapus data mahasiswa dari ArrayList berdasarkan indeks
    public void deleteData(int index){
        listmahasiswa.remove(index); // Menghapus data mahasiswa pada indeks yang dipilih
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author afifa
 */
public class mahasiswa { //membuat class mahasiswa untuk menyimpan informasi mhs, seperti nim, nama, alamat, mk, dan nilai akhir
    private String nim;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private double nilaiAkhir;
    
    //membuat Konstruktor kelas mahasiswa untuk menginisialisasi data mahasiswa
    public mahasiswa(String nim, String nama, String alamat, String mataKuliah, double nilaiAkhir){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    // Getter untuk mengambil nilai NIM mahasiswa
    public String getNim() {
    return nim;
    }
    
    // Getter untuk mengambil nilai nama mahasiswa
    public String getNama(){
        return nama;
    }
    
    // Getter untuk mengambil nilai alamat mahasiswa
    public String getAlamat(){
        return alamat;
    }
    
    // Getter untuk mengambil mata kuliah dari mahasiswa
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    // Getter untuk mengambil nilai akhir mahasiswa
    public double getNilaiAkhir(){
        return nilaiAkhir;
    }
    
    
    
}

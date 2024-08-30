/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23003_afifah_tugas_praktikum;

/**
 *
 * @author afifa
 */
public class Nilai {
    String npm;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUts;
    double nilaiUas;
    
    void inputNilai(String npm, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.npm = npm;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    double hitungNilaiAkhir(){
        return (nilaiAbsen * 0.1)+ (nilaiTugas * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
    }
    void cetakNilai() {
    System.out.println("NPM          : " + npm);
    System.out.println("Nama         : " + nama);
    System.out.println("Nilai Absen  : " + nilaiAbsen);
    System.out.println("Nilai Tugas  : " + nilaiTugas);
    System.out.println("Nilai Uts    : " + nilaiUts);
    System.out.println("Nilai Uas    : " + nilaiUas);
    System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
    }
}

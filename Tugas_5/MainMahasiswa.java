/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author afifa
 */
import java.util.Scanner; //diguanakan untuk user dapat menginputkan nilai

public class MainMahasiswa { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //deklarasi penamaan scanner dengan nama input

        // Input data mahasiswa
        System.out.print("Masukkan NPM: "); 
        String npm = input.nextLine(); //nextline digunakan untuk penggunaan string
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble(); //digunakan untuk peggunaan double
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble(); 
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(npm, namaMahasiswa, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        // Output data dengan memanggil data dalam var mahasiswa
        System.out.println("\n========== Program Hitung Nilai Akhir Mahasiswa ===========");
        System.out.println("NPM Mahasiswa    : " + mahasiswa.getNpm());
        System.out.println("Nama Mahasiswa   : " + mahasiswa.getNama());
        System.out.printf("Nilai Rata-rata  : %.2f\n", mahasiswa.hitungNilaiAkhir());
        System.out.println("Grade            : " + mahasiswa.tentukanGrade());
        System.out.println("Keterangan       : " + mahasiswa.tentukanKeterangan());

        input.close();
    }
}

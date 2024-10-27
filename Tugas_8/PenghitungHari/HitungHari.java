/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8HitungHari;

/**
 *
 * @author afifa
 */
public class HitungHari {

    //membuat methode untuk menghitung jumlah hari dalam suatu bulan pada tahun tertentu
     public static int hitung(int tahun, String bulan) {
        int jumlahHari; //membuat var untuk menyimpan jumlah hari
         //membuat pengkondisian pada bulan februari
         switch (bulan) {
             case "Februari":
                 if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0)) {
                     jumlahHari = 29; // membuat kondisi apabila Tahun kabisat maka jumlah hari = 29
                 } else {
                     jumlahHari = 28; // kondisi lain apabila Bukan tahun kabisat maka jumlah hari 28
                 }    break;
             case "April":
             case "Juni":
             case "September":
             case "November":
                 jumlahHari = 30; // kondisi lain apabila bukan bulan februari, dan hanya bulan april, juni,september, november maka jumlah hari adalah 30 hari
                 break;
             default:
                 jumlahHari = 31; //kondisi selain bulan diatas maka jumlah hari adalah 31 hari
                 break;
         }

        return jumlahHari; // Mengembalikan jumlah hari pada bulan dan tahun yang ditentukan
    }
}
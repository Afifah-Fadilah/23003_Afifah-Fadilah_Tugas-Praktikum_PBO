/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author afifa
 */
public class perhitunganNilai { //membuat kelas perhitunganNilai untuk menghitung nilai akhir  berdasarkan bobot nilai
    
    // Metode static untuk menghitung nilai akhir berdasarkan lima nilai yang diberikan
    public static double hitungNilaiAkhir(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        return (nilai1*0.10)+(nilai2*0.15)+(nilai3*0.25)+(nilai4*0.15)+(nilai5*0.35); // Menghitung nilai akhir dengan menjumlahkan masing-masing nilai yang dikalikan dengan bobotnya
        //nilai 1 berbobot 10%, nilai2 berbobot 15%, nilai3 berbobot 25%, nilai4 berbobot 15% dan nilai5 berbobot 35%
    }
}

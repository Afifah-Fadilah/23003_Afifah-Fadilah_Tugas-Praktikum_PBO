/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author afifa
 */

//kelas kubus adalab turunan dari kelas BangunRuang
public class Kubus extends BangunRuang {
    private double sisi; //deklarasi var sisi untuk menyimpan panjang sisi kubus
    
    //konstruksi untuk inisialisasi nilai sisi kubus
    public Kubus (double sisi) { 
        this.sisi = sisi;
    }
    
    //Override metode volume dari kelas BangunRuang
    //menghitung volume kubus dengan rumus sisi^3
    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
    
    //Override metode LuasPermukaan dari kelas BangunRuang
    //menghitung luas permukaan kubus dengan rumus 6 x (sisi x sisi)
    @Override
    public double luasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
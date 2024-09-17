/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author afifa
 */
public class Balok extends BangunRuang{
    //membuat variabel panjang, lebar dan tinggi
    private double panjang, lebar, tinggi;
    
    //konstruktor untuk inisialisasi nilai panjang, lebar, dan tinggi
    public Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    //Override metode volume dari kelas BangunRuang
    //menghitung volume balok dengan rumus panjang x lebar x tinggi
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
    
    //Override metode luasPermukaan dari kelas BangunRuang
    //Menghitung luas permukaan balok 
    @Override
    public double luasPermukaan(){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
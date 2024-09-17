/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author afifa
 */
public class Main {
    public static void main(String[] args) {

        //menampilkan judul untk menghitung volume dan luas balok
        System.out.println("============== Menghitung Volume & Luas Balok ==============");
        
        //membuat objek balok dengan panjang 4 cm, lebar 5 cm, dan tinggi 3 cm
        Balok balok = new Balok(4, 5, 3);
        
        //menampilkan hasil perhitungan volume dan luas permukaan balok 
        System.out.println("============================================================");
        System.out.println("Volume balok : " + balok.volume() + " cm");
        System.out.println("Luas permukaan balok : " + balok.luasPermukaan() + " cm");
        
        //menampilkan judul untuk menghitung volume dan luas kubus
        System.out.println("\n\n============== Menghitung Volume & Luas Kubus ==============");
        
        //membat objek kubus dengan sisi 4cm
        Kubus kubus = new Kubus(4);
        
        //menampilkan hasil perhitungan volume dan luas permukaan kubus
        System.out.println("============================================================");
        System.out.println("Volume Kubus : " + kubus.volume());
        System.out.println("Luas permukaan kubus : " + kubus.luasPermukaan());
    }
}
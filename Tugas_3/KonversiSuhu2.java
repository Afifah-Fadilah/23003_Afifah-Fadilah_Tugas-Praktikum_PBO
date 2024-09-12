/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author afifa
 */

class KonversiSuhu2 extends KonversiSuhu {
    
    // Method untuk mengonversi dari Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;  // Konversi ke Celcius terlebih dahulu
        return celcius * 4/5;                      // Lalu dari Celcius ke Reamur
    }
}

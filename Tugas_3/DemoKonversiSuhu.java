/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author afifa
 */
public class DemoKonversiSuhu {
    
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Mengonversi dari Celcius
        double celcius = 25;
        System.out.println(celcius + " Celcius to Fahrenheit: " + konversi.celciusToFahrenheit(celcius));
        System.out.println(celcius + " Celcius to Reamur: " + konversi.celciusToReamur(celcius));

        // Mengonversi dari Fahrenheit
        double fahrenheit = 77;
        System.out.println(fahrenheit + " Fahrenheit to Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}
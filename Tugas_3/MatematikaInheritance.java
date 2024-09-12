/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author afifa
 */
public class MatematikaInheritance {
    private Matematika2 math2 = new Matematika2();  // Membuat instance dari Matematika2
    
    // Method untuk menampilkan semua operasi
    public void semuaOperasi(int a, int b) {
        System.out.println("Pertambahan " + a + " + " + b + " : " + math2.pertambahan(a, b));
        System.out.println("Pengurangan " + a + " - " + b + " : " + math2.pengurangan(a, b));
        System.out.println("Perkalian " + a + " x " + b + " : " + math2.perkalian(a, b));
        System.out.println("Pembagian " + a + " / " + b + " : " + math2.pembagian(a, b));
        System.out.println("Modulus " + a + " % " + b + " : " + math2.modulus(a, b));
    }

    public static void main(String[] args) {
        MatematikaInheritance mathInherit = new MatematikaInheritance();
        // Memanggil method semuaOperasi dengan argumen yang sesuai
        mathInherit.semuaOperasi(20, 3);  
    }
}

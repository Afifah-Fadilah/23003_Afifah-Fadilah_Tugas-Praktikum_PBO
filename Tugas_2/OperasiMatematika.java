/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author afifa
 */
public class OperasiMatematika implements Matematika {
    @Override
    public int pertambahan(int a, int b){
        return a + b;
    }
    @Override
    public int pengurangan(int a, int b){
        return a - b;
    }
    @Override
    public int perkalian(int a, int b){
        return a * b;
    }
    @Override
    public float pembagian(float a, float b){
        if(b != 0){
            return a / b;
        }else{
        System.out.println("Pembagi tidak boleh 0");
        return 0;
        }
    }
        
}

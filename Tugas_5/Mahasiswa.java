/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author afifa
 */
public class Mahasiswa { //membuat var bernama mahasiswa, diperlukan ketika user akan menginputkan data mahasiswa
    private String npm; //menggunakan private untuk melindungi data mhs yang biasanya penting dan tidak sembarangan di akses dan diubah
    private String nama; 
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    // Constructor untuk inisialisasi data mahasiswa
    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() { //dengan ketentuan 10% untuk nilai kehadiran, 20% untuk nilai tugas, 30% untuk nilai uts dan 40% nilai uas
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS); 
    }

    // Method untuk menentukan grade berdasarkan nilai akhir
    public String tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir(); //menggunakan double agar ketika hasil berbentuk desimal, output tidak error
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) { //jika nilai akhir berada diantara 0 - 45 maka menghasilkan nilai E
            return "E";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) { //jika nilai akhir berada diantara 46 - 55 maka menghasilkan nilai D
            return "D";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) { //jika nilai akhir berada diantara 56 - 65 maka menghasilkan nilai C
            return "C";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) { //jika nilai akhir berada diantara 66 - 75 maka menghasilkan nilai B
            return "B";
        } else if (nilaiAkhir >= 76 && nilaiAkhir <= 100) { //jika nilai akhir berada diantara 56 - 65 maka menghasilkan nilai A
            return "A";
        } else { //jika nilai tidak berada di range di atas maka mengeluarkan output "tidak valid"
            return "Tidak Valid";
        }
    }

    // Method untuk menentukan keterangan berdasarkan grade
    public String tentukanKeterangan() { 
        String grade = tentukanGrade(); //memanggil fungsi tentukanGrade untuk mengembalikan nilai, dan nilai disimpan di grade
        switch (grade) { //membuat pengkondisian dari var grade
            case "A": //apabila nilai yang disimpan di grade adalah A, maka akan menampilkan output ISTIMEWA
                return "ISTIMEWA";
            case "B": //apabila nilai yang disimpan di grade adalah B, maka akan menampilkan output BAIK
                return "BAIK";
            case "C": //apabila nilai yang disimpan di grade adalah C, maka akan menampilkan output CUKUP
                return "CUKUP";
            case "D": //apabila nilai yang disimpan di grade adalah D, maka akan menampilkan output KURANG
                return "KURANG";
            case "E": //apabila nilai yang disimpan di grade adalah E, maka akan menampilkan output KURANG SEKALI
                return "KURANG SEKALI";
            default: //jika nilai yang disimpan di grade tidak berada di antara kondisi diatas maka mengoutputkan seperti di bawah
                return "Nilai di luar rentang";
        }
    }

    // Getter untuk NPM dan Nama
    public String getNpm() {  //getter digunakan untuk mengakses data yang bersifat private agar aman
        return npm;
    }

    public String getNama() {
        return nama;
    }
}
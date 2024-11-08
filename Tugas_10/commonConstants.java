/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author afifa
 */

//Kelas ini digunakan untuk koneksi JDBC dan pengaturan database dalam aplikasi
public class commonConstants {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //membuat nama driver JDBC untuk koneksi ke database MySQL
    static final String DB_URL = "jdbc:mysql://localhost/appKalkulator"; //URL koneksi ke database, disini nama database nya appKalkulator
    static final String DB_USERNAME = "root"; // Username untuk autentikasi ke database
    static final String DB_PASSWORD = ""; // Password untuk autentikasi ke database (kosong untuk default MySQL lokal)
    static final String DB_USER_TABLE_NAME = "user"; // Nama tabel dalam database yang digunakan untuk menyimpan data user
}

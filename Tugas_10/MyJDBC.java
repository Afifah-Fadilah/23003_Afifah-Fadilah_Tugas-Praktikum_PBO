/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author afifa
 */

import java.sql.*; // Import semua kelas dari package java.sql yang diperlukan untuk koneksi dan operasi dengan database

public class MyJDBC { 
    static { //digunakan untuk mendaftarkan driver JDBC
        try {
            Class.forName(commonConstants.JDBC_DRIVER); // Register JDBC driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Mencetak kesalahan jika driver JDBC tidak ditemukan
        }
    }

    //Membuat metode untuk mendaftarkan pengguna baru dengan username dan password
    public static boolean register(String username, String password) {
        try { 
            if (!checkUser(username)) {// Mengecek apakah pengguna sudah ada, jika tidak ada maka pengguna akan membuatnya, dan masuk ke database
                try (Connection connect = DriverManager.getConnection(commonConstants.DB_URL, commonConstants.DB_USERNAME, commonConstants.DB_PASSWORD)) {
                    PreparedStatement insertUser = connect.prepareStatement( // Membuat pernyataan SQL untuk memasukkan data pengguna baru
                        "INSERT INTO " + commonConstants.DB_USER_TABLE_NAME + " (username, password) VALUES (?, ?)" //username dan password di insert ke dalam database
                    );
                    
                     // Mengatur parameter untuk query
                    insertUser.setString(1, username);
                    insertUser.setString(2, password);

                    insertUser.executeUpdate(); // Menjalankan perintah untuk menyimpan data ke database
                    return true; //mengembalikan nilai menjadi true jika berhasil
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Menangkap dan mencetak kesalahan SQL
        }
        return false; // Mengembalikan nilai false jika pendaftaran gagal
    }

    public static boolean checkUser(String username) { // Metode untuk mengecek apakah username sudah terdaftar di database
        try (Connection connect = DriverManager.getConnection(commonConstants.DB_URL, commonConstants.DB_USERNAME, commonConstants.DB_PASSWORD)) {
            PreparedStatement checkUserExists = connect.prepareStatement( // Membuat pernyataan SQL untuk mengecek keberadaan username
                "SELECT * FROM " + commonConstants.DB_USER_TABLE_NAME + " WHERE username = ?"
            );

            checkUserExists.setString(1, username);  // Mengatur parameter untuk query

            ResultSet result = checkUserExists.executeQuery();  // Menjalankan perintah dan mendapatkan hasil
            
             // Mengecek apakah hasil mengandung data
            if (!result.isBeforeFirst()) {  // jika tidak ada result set
                return false; //mengembalikan false jika username tidak ditemukan
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Menangkap dan mencetak kesalahan SQL
        }

        return true; // Mengembalikan true jika username ditemukan
    }
    
    // Metode untuk memvalidasi login pengguna berdasarkan username dan password
    public static boolean validasiLogin(String username, String password) {
        try (Connection connect = DriverManager.getConnection(commonConstants.DB_URL, commonConstants.DB_USERNAME, commonConstants.DB_PASSWORD)) {
            PreparedStatement validasiUser = connect.prepareStatement(   // Membuat pernyataan SQL untuk memvalidasi username dan password
                "SELECT * FROM " + commonConstants.DB_USER_TABLE_NAME + " WHERE username = ? AND password = ?"
            );
             // Mengatur parameter untuk query
            validasiUser.setString(1, username);
            validasiUser.setString(2, password);

            // Menjalankan perintah dan mendapatkan hasil
            ResultSet result = validasiUser.executeQuery();
            
             // Mengecek apakah hasil mengandung data
            if (!result.isBeforeFirst()) { //jika tidak ada dalam data resultset
                return false; //mengembalikan false jika username dan password tidak valid
            }
        } catch (SQLException e) { 
            e.printStackTrace();  // Menangkap dan mencetak kesalahan SQL
        }
        return true; // Mengembalikan true jika validasi berhasil
    }
}
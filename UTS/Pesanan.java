/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author afifa
 */


public class Pesanan {
    // Variabel untuk menyimpan informasi pesanan
    private String namaPemesan; // Nama pemesan
    private String nomorKTP; // Nomor KTP pemesan
    private Kamar kamar; // Objek kamar yang dipesan
    private int durasiHari; // Durasi pemesanan dalam hari
    private double totalHarga; // Total harga untuk pemesanan
    private String alamatPemesan; // Alamat pemesan
    private String tanggalCheckIn; // Tanggal check-in
    private String jamCheckIn; // Jam check-in
    private boolean paid; // Status pembayaran (sudah dibayar atau belum)

    // Konstruktor untuk menginisialisasi objek Pesanan
    public Pesanan(String namaPemesan, String nomorKTP, Kamar kamar, int durasiHari, double totalHarga, String alamatPemesan, String tanggalCheckIn, String jamCheckIn) {
        this.namaPemesan = namaPemesan; // Inisialisasi nama pemesan
        this.nomorKTP = nomorKTP; // Inisialisasi nomor KTP
        this.kamar = kamar; // Inisialisasi objek kamar yang dipesan
        this.durasiHari = durasiHari; // Inisialisasi durasi pemesanan
        this.totalHarga = totalHarga; // Inisialisasi total harga
        this.alamatPemesan = alamatPemesan; // Inisialisasi alamat pemesan
        this.tanggalCheckIn = tanggalCheckIn; // Inisialisasi tanggal check-in
        this.jamCheckIn = jamCheckIn; // Inisialisasi jam check-in
        this.paid = false; // Status pembayaran diatur ke false (belum dibayar) saat dibuat
    }

    // Getter methods untuk mengambil informasi pesanan
    public String getNamaPemesan() {
        return namaPemesan; // Mengembalikan nama pemesan
    }

    public String getNomorKTP() {
        return nomorKTP; // Mengembalikan nomor KTP pemesan
    }

    public Kamar getKamar() {
        return kamar; // Mengembalikan objek kamar yang dipesan
    }

    public int getDurasiHari() {
        return durasiHari; // Mengembalikan durasi pemesanan dalam hari
    }

    public double getTotalHarga() {
        return totalHarga; // Mengembalikan total harga pemesanan
    }

    public String getAlamatPemesan() {
        return alamatPemesan; // Mengembalikan alamat pemesan
    }

    public String getTanggalCheckIn() {
        return tanggalCheckIn; // Mengembalikan tanggal check-in
    }

    public String getJamCheckIn() {
        return jamCheckIn; // Mengembalikan jam check-in
    }

    public boolean isPaid() {
        return paid; // Mengembalikan status pembayaran
    }

    public void setPaid(boolean paid) {
        this.paid = paid; // Mengubah status pembayaran
    }
}
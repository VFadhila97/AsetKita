package com.mycompany.asetkita;

public class Aset {

    // Atribut (data aset)
    private String kodeAset;
    private String namaAset;
    private double hargaPerolehan;
    private String kondisi;

    // Constructor
    public Aset(String kodeAset, String namaAset,
                double hargaPerolehan, String kondisi) {
        this.kodeAset = kodeAset;
        this.namaAset = namaAset;
        this.hargaPerolehan = hargaPerolehan;
        this.kondisi = kondisi;
    }

    // Getter dan Setter
    public String getKodeAset() {
        return kodeAset;
    }

    public void setKodeAset(String kodeAset) {
        this.kodeAset = kodeAset;
    }

    public String getNamaAset() {
        return namaAset;
    }

    public void setNamaAset(String namaAset) {
        this.namaAset = namaAset;
    }

    public double getHargaPerolehan() {
        return hargaPerolehan;
    }

    public void setHargaPerolehan(double hargaPerolehan) {
        this.hargaPerolehan = hargaPerolehan;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    // Method untuk menampilkan informasi aset
    public void tampilkanInfo() {
        System.out.println("Kode Aset : " + kodeAset);
        System.out.println("Nama Aset : " + namaAset);
        System.out.println("Harga     : Rp" + hargaPerolehan);
        System.out.println("Kondisi   : " + kondisi);
    }
}


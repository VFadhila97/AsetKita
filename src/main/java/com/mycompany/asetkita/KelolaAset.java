
package com.mycompany.asetkita;

import java.util.ArrayList;

public class KelolaAset {

    // Menyimpan daftar aset
    private ArrayList<AsetProduksi> daftarAset;

    // Constructor
    public KelolaAset() {
        daftarAset = new ArrayList<>();
    }

    // Method untuk menambahkan aset
    public void tambahAset(AsetProduksi aset) {
        daftarAset.add(aset);
        System.out.println("Aset berhasil ditambahkan!");
    }

    // Method untuk menampilkan seluruh aset
    public void tampilkanAset() {

        if (daftarAset.isEmpty()) {
            System.out.println("Belum ada data aset.");
        } else {

            System.out.println("\n===== DAFTAR ASET =====");

            for (AsetProduksi aset : daftarAset) {
                System.out.println("----------------------");
                aset.tampilkanInfo();
            }
        }
    }
}

package com.mycompany.asetkita;

import java.util.Scanner;

public class AsetKita {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat objek KelolaAset
        KelolaAset pengelola = new KelolaAset();

        int pilihan;

        // Perulangan menu utama
        while (true) {

            System.out.println("\n==============================");
            System.out.println("          ASETKITA");
            System.out.println("   SISTEM MANAJEMEN ASET UMKM");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Aset");
            System.out.println("2. Tampilkan Data Aset");
            System.out.println("3. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println("\n=== TAMBAH DATA ASET ===");

                    System.out.print("Kode Aset       : ");
                    String kode = input.nextLine();

                    System.out.print("Nama Aset       : ");
                    String nama = input.nextLine();

                    System.out.print("Harga Perolehan : ");
                    double harga = input.nextDouble();
                    input.nextLine();

                    System.out.print("Kondisi Aset    : ");
                    String kondisi = input.nextLine();

                    System.out.print("Jenis Produksi  : ");
                    String jenis = input.nextLine();

                    // Membuat objek AsetProduksi
                    AsetProduksi aset = new AsetProduksi(
                            kode, nama, harga, kondisi, jenis
                    );

                    // Menambahkan aset ke daftar
                    pengelola.tambahAset(aset);

                    break;

                case 2:

                    // Menampilkan daftar aset
                    pengelola.tampilkanAset();

                    break;

                case 3:

                    System.out.println("\nTerima kasih telah menggunakan AsetKita!");
                    input.close();
                    return;

                default:

                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");

            }
        }
    }
}

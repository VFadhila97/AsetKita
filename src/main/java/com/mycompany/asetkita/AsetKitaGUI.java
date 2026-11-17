
package com.mycompany.asetkita;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class AsetKitaGUI extends Application {

    @Override
    public void start(Stage stage) {

        // Judul aplikasi
        Label judul = new Label("ASETKITA");
        Label subjudul = new Label("Sistem Manajemen Aset UMKM");

        // Label input
        Label labelKode = new Label("Kode Aset");
        Label labelNama = new Label("Nama Aset");
        Label labelHarga = new Label("Harga Perolehan");
        Label labelKondisi = new Label("Kondisi Aset");
        Label labelJenis = new Label("Jenis Produksi");

        // TextField input
        TextField inputKode = new TextField();
        TextField inputNama = new TextField();
        TextField inputHarga = new TextField();
        TextField inputKondisi = new TextField();
        TextField inputJenis = new TextField();

        // Placeholder
        inputKode.setPromptText("Masukkan kode aset");
        inputNama.setPromptText("Masukkan nama aset");
        inputHarga.setPromptText("Masukkan harga aset");
        inputKondisi.setPromptText("Masukkan kondisi aset");
        inputJenis.setPromptText("Masukkan jenis produksi");

        // Layout form menggunakan GridPane
        GridPane form = new GridPane();
        form.setHgap(15);
        form.setVgap(12);

        form.add(labelKode, 0, 0);
        form.add(inputKode, 1, 0);

        form.add(labelNama, 0, 1);
        form.add(inputNama, 1, 1);

        form.add(labelHarga, 0, 2);
        form.add(inputHarga, 1, 2);

        form.add(labelKondisi, 0, 3);
        form.add(inputKondisi, 1, 3);

        form.add(labelJenis, 0, 4);
        form.add(inputJenis, 1, 4);

        // Tombol tambah aset
        Button tombolTambah = new Button("Tambah Aset");
        KelolaAset pengelola = new KelolaAset();


tombolTambah.setOnAction((ActionEvent event) -> {

    // Mengambil data dari form
    String kode = inputKode.getText().trim();
    String nama = inputNama.getText().trim();
    String hargaText = inputHarga.getText().trim();
    String kondisi = inputKondisi.getText().trim();
    String jenis = inputJenis.getText().trim();

    // Validasi kolom kosong
    if (kode.isEmpty() || nama.isEmpty() ||
        hargaText.isEmpty() || kondisi.isEmpty() ||
        jenis.isEmpty()) {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Peringatan");
        alert.setHeaderText("Data Belum Lengkap");
        alert.setContentText("Semua kolom wajib diisi!");
        alert.showAndWait();

        return;
    }

    // Validasi harga dan proses penambahan aset
    try {

        double harga = Double.parseDouble(hargaText);

        AsetProduksi aset = new AsetProduksi(
            kode, nama, harga, kondisi, jenis
        );

        pengelola.tambahAset(aset);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informasi Aset");
        alert.setHeaderText("Data Berhasil Ditambahkan");
        alert.setContentText(
            "Aset " + nama + " berhasil ditambahkan."
        );
        alert.showAndWait();

    } catch (NumberFormatException e) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Kesalahan Input");
        alert.setHeaderText("Harga Tidak Valid");
        alert.setContentText(
            "Harga perolehan harus berupa angka!"
        );
        alert.showAndWait();
    }
});

        
        // Layout utama
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(25));

        layout.getChildren().addAll(
                judul,
                subjudul,
                form,
                tombolTambah
        );

        // Membuat Scene
        Scene scene = new Scene(layout, 550, 450);

        // Menampilkan jendela
        stage.setTitle("AsetKita - Manajemen Aset");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.mycompany.asetkita;

public class AsetProduksi extends Aset {

    // Atribut tambahan
    private String jenisProduksi;

    // Constructor
    public AsetProduksi(String kodeAset, String namaAset,
                        double hargaPerolehan, String kondisi,
                        String jenisProduksi) {

        // Memanggil constructor dari superclass Aset
        super(kodeAset, namaAset, hargaPerolehan, kondisi);

        this.jenisProduksi = jenisProduksi;
    }

    // Getter
    public String getJenisProduksi() {
        return jenisProduksi;
    }

    // Setter
    public void setJenisProduksi(String jenisProduksi) {
        this.jenisProduksi = jenisProduksi;
    }

    // Menampilkan informasi aset produksi
    @Override
    public void tampilkanInfo() {

        // Memanggil method dari superclass
        super.tampilkanInfo();

        System.out.println("Jenis Produksi : " + jenisProduksi);
    }
}

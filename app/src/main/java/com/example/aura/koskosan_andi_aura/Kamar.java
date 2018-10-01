package com.example.aura.koskosan_andi_aura;

public class Kamar {
    private String nama_kamar;
    private String fasilitas;
    private String harga;

    public static final Kamar[] jeniskamar= {
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000"),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000"),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000"),
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000"),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000"),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000"),
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000"),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000"),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000"),
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000"),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000"),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000"),
    };

    public Kamar(String name, String facilitation, String price) {
        this.nama_kamar = name;
        this.fasilitas = facilitation;
        this.harga = price;
    }

    public String getName() {
        return nama_kamar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public String getHarga() {
        return harga;
    }

    public String toString() {
        return this.nama_kamar;
    }
}

package com.example.aura.koskosan_andi_aura;

public class Kamar {
    private String nama_kamar;
    private String fasilitas;
    private String harga;
    private int gambar;

    public static final Kamar[] jeniskamar= {
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000", R.drawable.loupe),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000", R.drawable.home),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000", R.drawable.home),
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000", R.drawable.home),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000", R.drawable.home),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000", R.drawable.home),
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000", R.drawable.home),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000", R.drawable.home),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000", R.drawable.home),
            new Kamar("Cilok", "tepung, terasi, air", "1.200.000", R.drawable.home),
            new Kamar("Batagor", "tepung, kacang, daging", "800.0000", R.drawable.home),
            new Kamar("Bakwan", "tepung, jagung, air", "600.000", R.drawable.home),
    };

    public Kamar(String name, String facilitation, String price, int image) {
        this.nama_kamar = name;
        this.fasilitas = facilitation;
        this.harga = price;
        this.gambar = image;
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

    public int getGambar() {
        return gambar;
    }

    public String toString() {
        return this.nama_kamar;
    }
}

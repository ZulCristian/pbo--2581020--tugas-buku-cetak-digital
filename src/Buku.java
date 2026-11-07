public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public int hargaAkhir() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + formatRupiah(harga));
    }

    protected static String formatRupiah(int angka) {
        String digits = String.valueOf(angka);
        StringBuilder sb = new StringBuilder();
        int hitung = 0;
        for (int i = digits.length() - 1; i >= 0; i--) {
            sb.append(digits.charAt(i));
            hitung++;
            if (hitung % 3 == 0 && i != 0) {
                sb.append('.');
            }
        }
        return "Rp" + sb.reverse().toString();
    }
}
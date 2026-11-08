public class TokoBuku {
    public static void main(String[] args) {
        Buku b1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        Buku b2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        Buku b3 = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);

        Buku[] keranjang = { b1, b2, b3 };

        System.out.println("=============== KERANJANG ===============");
        int total = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            total += b.hargaAkhir();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar   : " + Buku.formatRupiah(total));

    }
}
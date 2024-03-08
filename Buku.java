public class Buku {
    private String judulBuku;
    private String penerbit;
    private int tahunTerbit;

    public Buku(String judulBuku, String penerbit, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;

    }
    @Override
    public String toString() {
        return "POJO [judulBuku=" + judulBuku + ", penerbit=" + penerbit + ", tahunTerbit=" + tahunTerbit + "]";
    }
}
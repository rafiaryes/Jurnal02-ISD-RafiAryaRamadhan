public class ATK {
    public String kodeBarang;
    public String namaBarang;
    public String jenisBarang;
    public int stock;

    public ATK(String kodeBarang, String namaBarang, String jenisBarang, int stock) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stock = stock;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "ATK [kodeBarang=" + kodeBarang + ", namaBarang=" + namaBarang + ", jenisBarang=" + jenisBarang
                + ", stock=" + stock + "]";
    }       
}
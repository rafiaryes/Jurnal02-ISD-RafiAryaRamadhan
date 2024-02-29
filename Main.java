import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenArrayList<ATK> daftarATK = new GenArrayList<>(5);
        GenArrayList<Bag> daftarBag = new GenArrayList<>(5);

        daftarATK.addData(new ATK("A001", "Pulpen Kenko", "Pulpen", 100));
        daftarATK.addData(new ATK("A002", "Pensil Stabilo 2B", "Pensil", 100));
        daftarATK.addData(new ATK("A003", "Spidol Snowman", "Spidol", 100));
        daftarATK.addData(new ATK("B001", "Sinar Dunia", "Buku Tulis", 100));
        daftarATK.addData(new ATK("B002", "Paper One", "Kertas HVS", 100));

        daftarBag.addData(new Bag("C001", "Tas Eiger", "Tas", 100));
        daftarBag.addData(new Bag("C002", "Tempat Pensil Faber Castle", "Tempat Pensil", 100));
        daftarBag.addData(new Bag("C003", "Papan Jalan Faber Castle", "Papan Jalan", 100));
        daftarBag.addData(new Bag("C004", "Papan Tulis Whiteboard", "Papan Tulis", 100));
        daftarBag.addData(new Bag("C001", "Streples Joyko", "Streples", 100));

        daftarATK.display();
        daftarBag.display();
    }
}

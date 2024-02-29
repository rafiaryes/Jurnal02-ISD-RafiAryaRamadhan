import java.util.*;

public class GenArrayList <E> {
    private final ArrayList<E> list;//variabel, atribut

    //konstruktor
    //membentuk objek
    //memberi nilai awal bagi objek yang dibentuk
    public GenArrayList(int capacity) {
        int initCapacity = capacity > 0? capacity:0;
        list = new ArrayList<>(capacity);
    }

    public void addData(E values) {
        list.add(values);
    }

    public void display(){
        for (int i = 0; i<list.size();i++) {
            System.out.println();
        System.out.printf(list.get(i) + " ");
        }
        System.out.println();
        }
}
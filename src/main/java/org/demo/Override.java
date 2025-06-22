package org.demo;

public class Override {
    public static void main(String[] args) {
        System.out.println("Cantik");

        Kendaraan kendaraan = new Kendaraan();
        mobil mobil = new mobil();

        kendaraan.suara();
        mobil.suara();

        System.out.println(orang.nama + orang.name);
    }

}

class Kendaraan{
    void suara(){
        System.out.println("Hallo Friend's");
    }
}

class mobil extends Kendaraan {

}

final class motor {

}

interface becak {
    void terbang();
}

class burung implements becak {
    @java.lang.Override
    public void terbang(){
        System.out.println("");
    }
}

abstract class Bentuk {
    String nama;
    public Bentuk(String nama){
        this.nama = nama;
        }
}

class Lingkaran extends Bentuk {
    String merk;

    public Lingkaran(String nama, String merk){
        super(nama);
        this.merk = merk;

    }

    void suara(){;
    }
}

class orang {
    static String nama = "joko";
    static String name = "joko";
}

final class org {
    private String nama = "jok";
}





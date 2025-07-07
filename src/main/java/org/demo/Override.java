package org.demo;

public class Override {
    protected String nama;
    String name;
    public String nami;
    public String namo;

    public Override(String namo, String nami){
        this.namo = namo; //ini untuk private hanya bisa diakses oleh kelas pembuat dia gak bisa diakses oleh subclass walaupun di package yang sma
        this.nami = nami;
    }


    public static void main(String[] args) {
        System.out.println("Cantik");

        Kendaraan kendaraan = new Kendaraan();
        mobil mobil = new mobil();

        kendaraan.suara();
        mobil.suara();

        System.out.println(orang.nama + orang.name);

        v1 v1 = new v1("Brucad", "Kmau", "kamu", "Pintar"); //ini fungs dari subclass yang ada di Main.java

        v1.dia();
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

    private void su(){
        System.out.println("");
    }

    protected void suu(){
        System.out.println("");
    }

}

class Lingkaran1 extends Bentuk {
    String merk;

    public Lingkaran1(String nama, String merk){
        super(nama);
        this.merk = merk;

    }

    void suara(){;
    }

    private void su(){
        System.out.println("");
    }

    protected void suu(){
        System.out.println("");
    }

}

class orang {
    static String nama = "joko";
    static String name = "joko";
}

final class org {
    private String nama = "jok";
}





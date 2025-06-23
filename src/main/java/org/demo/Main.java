package org.demo;

public class Main {
    String merk1;
    String bunyi1;
    Integer roda1;
    Integer spion1;

    public Main(String merk, String bunyi, Integer roda, Integer spion){
        this.bunyi1 = bunyi;
        this.roda1 = roda;
        this.spion1 = spion;
        this.merk1 = merk;
    }

    public void infoHewan() {
        System.out.println("Merk" + merk1 + "Bunyi" + bunyi1 + "Jumlah Spion" + spion1 + "Jumlah Roda" + roda1);
    }

    public static void main(String [] param){
        Main Kucing = new Main("Ambuyan", "meong", 2,2);
        Main Mio = new Main("Mio", "Ngengg", 2,2);

        Kucing.infoHewan();
        Mio.infoHewan();
        System.out.println(org.class);
    }
}

class v1 extends Override {
    String Hello;
    public v1(String nama, String name, String hello, String namo){  //bisa mengakses dari attribut supeclass yang memakai protected dan menambah satu attribut baru atau memperluas
        super(namo); //ini soalnya ada param di Superclass kita harus manaruhnya disini
        this.nama = nama;
        this.name = name; //Tapi kalau default dia msuk private tapi bisa diakses oleh subclassnya di dalam package yang sma
        this.nami = "Nami"; // Ini dia public jadi bisa diakses dengan gampang
        // this.namo = ""; // kalau attribute di subclass private dia tidak bisa diakses oleh subclass kecuali class nya seniri
        this.Hello = hello;
    }

    public void dia () {
        System.out.println("nama" + nama + "Spa" + Hello + name + nami);
    }
}
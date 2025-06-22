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
    }

}


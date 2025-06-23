package demo1;

public class Chaining {
    public static void main(String[] args) {
        Chaining chaining1 = new Chaining("Balpoin");

        chaining1.setWarnaTradisional("Hijau");
        chaining1.setKetebalan(1);
        chaining1.infoChaining();

        Chaining chaining2 = new Chaining("Kamu");

        chaining2.setWarnaTradisional("Snowman");
        chaining2.setKetebalan(3);
        chaining2.infoChaining();

        Chaining chaining3 = new Chaining("Glowman");

        chaining3.setWarnaTradisional("Merah");
        chaining3.setKetebalan(5);
        chaining3.infoChaining();
    }
    private String warna;
    private String merk;
    private int ketebalan;

    public Chaining(String merk){
        this.merk = merk;
    }

    public void setWarnaTradisional(String warna){
        this.warna = warna;
    }

    public Chaining setWarna(String warna){
        this.warna = warna;
        return this;
    }

    public Chaining setKetebalan(int ketebalan){
        this.ketebalan = ketebalan;
        return this;
    }

    public void infoChaining(){
        System.out.println("Merk " + merk + " Warna " + warna + "Ketebalan" + ketebalan);
    }
}



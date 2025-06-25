package demo1;

public class NonChaining {
    public static void main(String[] args) {
        NonChaining nonChaining = new NonChaining("Biru", "Snowman", 3);
        nonChaining.infoNonChaining();

        NonChaining nonChaining1 = new NonChaining("Hijau", "Glowman", 1);
        nonChaining1.infoNonChaining();
    }
    private String merk;
    private String warna;
    private int ketebalan;

    public NonChaining (String warna, String merk, int ketebalan){
        this.warna = warna;
        this.merk = merk;
        this.ketebalan = ketebalan;
    }

    public void infoNonChaining (){
        System.out.println("Warna" + warna);
    }

}

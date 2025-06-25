package Interface;

interface Interface1 {

    void mulaiMesin();

    void mulaiMaju();

    void mulaiMundur();
}

class mobil implements Interface1 {
    private String nama;

    public mobil(String nama) {
        this.nama = nama;
    }

    @Override
    public void mulaiMesin() {
        System.out.println("Hello World");
    }

    public void mulaiMaju() {
        System.out.println("Hello Kawan" + nama);
    }

    public void mulaiMundur() {
        System.out.println("Hello Mass");
    }

    public static void main(String[] args) {
        System.out.println();

        mobil mobil = new mobil("Brucad Al Magribi");
        mobil.mulaiMaju();
        mobil.mulaiMesin();
        mobil.mulaiMundur();
    }

}




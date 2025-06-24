package Builder;


// Cara Pengimplementasian Buildernya Setelah kita konfigurasi di Builder 1 tadi.
public class DemoBuilder {
    public static void main(String[] args) {
        Builder1 builder1 = new Builder1.Builder("Nilai A Wajib")
                .setPropertiB(100)
                .setPropertiC(true)
                .build();

        System.out.println(builder1);
    }
}

package LambdaExpression;

public class WithLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello everyone!"));
        thread.start();
    }
}

class notLambda  {
    public static void main(String[] args) {
        System.out.println("Halop");
    }

    static void Mobil(){
        System.out.println(" Hello Every one");
    }
}

interface Aksitombol {
    void onClick();
}

class Tombol {
    private Aksitombol aksi;

    public void setAksiKlik(Aksitombol aksi){
        this.aksi = aksi;
    }

    public void klik(){
        if(aksi != null){
            aksi.onClick();
        }
    }
}

class WithoutLambda {
    public static void main(String[] args) {
        Tombol tombol = new Tombol();
        tombol.setAksiKlik(new Aksitombol() {
            @Override
            public void onClick() {
                System.out.println("Tombol Ok Di Klik");
            }
        });
        tombol.klik();
    }
}

class withLambda {
    public static void main(String[] args) {
        Tombol tombol = new Tombol();
        tombol.setAksiKlik(() -> System.out.println("Tombol Ok Di Klik"));
        tombol.klik();
    }
}

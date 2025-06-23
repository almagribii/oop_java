package demo1;

import org.demo.Override;

public class Demo {
    public static void main (String[] nama){
        System.out.println("Memulai Aplikasi Bersama Orang Pintar Brucad");

        Demo demo = new Demo(" My name Orang Pintar");
        demo.kamu();
    }

    public String nami;
    public Demo (String nami){
        this.nami = nami;
    }

    Override override = new Override("Hallo", "Hello");

     void kamu (){
        System.out.println("Namo " + override.nami + nami);
    }




}



package Record;

import java.util.Objects;

public class Mahasiswa {

    private int nim;
    private String nama;

    public Mahasiswa(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    // Methode Getter because the attribute is private
    public  int getNim(){
        return getNim();
    }

    public String getNama() {
        return getNama();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Mahasiswa mahasiswa = (Mahasiswa) o; // Methode Casting

        return Objects.equals(this.nim, mahasiswa.nim) &&
                Objects.equals(this.nama, mahasiswa.nama);
    }
}

record ndn(){}
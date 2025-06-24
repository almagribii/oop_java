package Builder;

import java.nio.file.attribute.AclEntry;

public class Builder1 {
    private String propertiA; // Misalkan Ini adalah atribute wajib
    private int propertiB;  // Attribute Optional
    private boolean propertiC;  // Attribute Optional

    private Builder1(Builder builder){ //Cukup yang di param untuk constructor nya hanya builder saja
        this.propertiA = builder.propertiA;
        this.propertiB = builder.propertiB;
        this.propertiC = builder.propertiC;
    }
    //Disini Builder Bekerja
    public static class Builder {
        private String propertiA;
        private int propertiB = 0;
        private boolean propertiC = false;

        //Ini Adalah Attribute Wajibnya
        public Builder(String propertiA){
            this.propertiA = propertiA;
        }

        // Ini Adalah Attribute Optional yang dimana dia harus ngeSet dan diterakhirnya, return.this
        public Builder setPropertiB (int propertiB) {
            this.propertiB = propertiB;
            return this;
        }

        // Ini Sama kek PropertiB
        public Builder setPropertiC (boolean propertiC){
            this.propertiC = propertiC;
            return this;
        }


        public Builder1 build() {
            return new Builder1(this);
        }
    }

    public String toString(){
        return "Builder [propertiA=" + propertiA + ", propertiB=" + propertiB + ", propertiC=" + propertiC + "]";
    }
}

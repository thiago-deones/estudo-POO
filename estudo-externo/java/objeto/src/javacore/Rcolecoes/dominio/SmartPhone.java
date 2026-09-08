package javacore.Rcolecoes.dominio;

public class SmartPhone {
    private String seriaNumber;
    private String marca;

    public SmartPhone(String seriaNumver, String marca) {
        this.seriaNumber = seriaNumver;
        this.marca = marca;
    }

    // Reflexivo : x.equals(X) tem q ser true para tudo q for diferente de null
    //simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equls(x) == true
    //transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true ....

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return seriaNumber != null && seriaNumber.equals(smartPhone.seriaNumber);
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

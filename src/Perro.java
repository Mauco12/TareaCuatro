public class Perro {
    String nombreP;
    String tipoComidaP;
    int paseosP;
    String razaP;
    boolean vivoP;

    public Perro(String nombreP, String tipoComidaP, int paseosP, String razaP, boolean vivoP) {
        this.nombreP = nombreP;
        this.tipoComidaP = tipoComidaP;
        this.paseosP = paseosP;
        this.razaP = razaP;
        this.vivoP = vivoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getTipoComidaP() {
        return tipoComidaP;
    }

    public void setTipoComidaP(String tipoComidaP) {
        this.tipoComidaP = tipoComidaP;
    }

    public int getPaseosP() {
        return paseosP;
    }

    public void setPaseosP(int paseosP) {
        this.paseosP = paseosP;
    }

    public String getRazaP() {
        return razaP;
    }

    public void setRazaP(String razaP) {
        this.razaP = razaP;
    }

    public boolean isVivoP() {
        return vivoP;
    }

    public void setVivoP(boolean vivoP) {
        this.vivoP = vivoP;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombreP='" + nombreP + '\'' +
                ", tipoComidaP='" + tipoComidaP + '\'' +
                ", paseosP=" + paseosP +
                ", razaP='" + razaP + '\'' +
                ", vivoP=" + vivoP +
                '}';
    }
}


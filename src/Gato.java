public class Gato {


    String nombreG;
    String colorG;
    int edadG;
    String razaG;
    boolean vivoG;

    public Gato(String nombreG, String colorG, int edadG, String razaG, boolean vivoG) {
        this.nombreG = nombreG;
        this.colorG = colorG;
        this.edadG = edadG;
        this.razaG = razaG;
        this.vivoG = vivoG;
    }

    public String getNombreG() {
        return nombreG;
    }

    public void setNombreG(String nombreG) {
        this.nombreG = nombreG;
    }

    public String getColorG() {
        return colorG;
    }

    public void setColorG(String colorG) {
        this.colorG = colorG;
    }

    public int getEdadG() {
        return edadG;
    }

    public void setEdadG(int edadG) {
        this.edadG = edadG;
    }

    public String getRazaG() {
        return razaG;
    }

    public void setRazaG(String razaG) {
        this.razaG = razaG;
    }

    public boolean isVivoG() {
        return vivoG;
    }

    public void setVivoG(boolean vivoG) {
        this.vivoG = vivoG;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombreG='" + nombreG + '\'' +
                ", colorG='" + colorG + '\'' +
                ", edadG=" + edadG +
                ", razaG='" + razaG + '\'' +
                ", vivoG=" + vivoG +
                '}';
    }
}




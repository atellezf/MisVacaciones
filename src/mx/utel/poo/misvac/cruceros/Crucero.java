package mx.utel.poo.misvac.cruceros;

public class Crucero {

        private String naviera;
        private String destino;
        private int noches;
        private String categoria;

    public String getNaviera() {
        return naviera;
    }

    public void setNaviera(String naviera) {
        this.naviera = naviera;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




    public Crucero(String naviera, String destino, int noches, String categoria) {
        this.naviera = naviera;
        this.destino = destino;
        this.noches = noches;
        this.categoria = categoria;
    }






    @Override
    public String toString() {
        return "\tCrucero: %s/%s %d /%s año(s)\n".formatted(naviera, destino, noches,categoria);
    }
}

package mx.utel.poo.misvac.traslados;

public class Traslado
{

    private String origen;
    private String destino;
    private String pickup;

    public Traslado(String origen, String destino, String pickup)
    {
        this.origen = origen;
        this.destino = destino;
        this.pickup = pickup;
    }

    public String getOrigen() {return origen;}

    public void setOrigen(String origen) {this.origen = origen;}

    public String getDestino() {return destino;}

    public void setDestino(String destino) {this.destino = destino;}

    public String getPickup() {return pickup;}

    public void setPickup(String pickup) {this.pickup = pickup;}

    @Override
    public String toString()
    {
        return "\tTraslado: %s/%s/%s año(s)\n".formatted(origen, destino, pickup);
    }
}

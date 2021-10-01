package mx.utel.poo.misvac.aereos;

public class Aereo
{

    private String origen;
    private String destino;
    private String horaSalida;
    private String horaLlegada;

    public Aereo(String origen, String destino, String horaSalida, String horaLlegada)
    {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public String getOrigen() {return origen;}

    public void setOrigen(String origen) {this.origen = origen;}

    public String getDestino() {return destino;}

    public void setDestino(String destino) {this.destino = destino;}

    public String getHoraSalida() {return horaSalida;}

    public void setHoraSalida(String horaSalida) {this.horaSalida = horaSalida;}

    public String getHoraLlegada() {return horaLlegada;}

    public void setHoraLlegada(String horaLlegada) {this.horaLlegada = horaLlegada;}

    @Override
    public String toString() {
        return "\tcrucero: %s/%s %d año(s)\n".formatted(origen, destino, horaSalida,horaLlegada);
    }
}


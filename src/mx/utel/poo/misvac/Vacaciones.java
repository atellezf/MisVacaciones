package mx.utel.poo.misvac;

import mx.utel.poo.misvac.pasajeros.Pasajero;

import java.util.List;

public class Vacaciones {

    private String origen;
    private String destino;
    private String fecha;
    private List<Pasajero> pasajeros;
//    private List<Aereo> aereos;
//    private List<Crucero> cruceros;
//    private List<Hospedaje> hospedaje;
//    private List<Traslado> traslados;

    public Vacaciones(String origen, String destino, String fecha) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        pasajeros = List.of();
//        aereos = List.of();
//        cruceros = List.of();
//        hospedaje = List.of();
//        traslados = List.of();
    }

    public boolean agregarPasajero(Pasajero p) {
        return pasajeros.add(p);
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder(
        """
        Mis próximas vacaciones
            Origen: %s   Destino: %s     Fecha: %s
        """.formatted(origen, destino, fecha));
        for (Pasajero pas: pasajeros) {
            cadena.append(pas);
        }
        // TODO: 9/30/21 Agregar aereos, cruceros, hospedajes, y traslados
        return cadena.toString();
    }
}

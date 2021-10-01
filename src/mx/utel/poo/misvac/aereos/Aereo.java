package mx.utel.poo.misvac.aereos;




    public class Aereo {
        private String origin;
        private String destino;
        private String horaSalida;
        private String horaLlegada;



        public Aereo(String origin, String destino, String horaSalida, String horaLlegada) {
            this.origin = origin;
            this.destino = destino;
            this.horaSalida = horaSalida;
            this.horaLlegada = horaLlegada;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public void setHoraSalida(String horaSalida) {
            this.horaSalida = horaSalida;
        }

        public void setHoraLlegada(String horaLlegada) {
            this.horaLlegada = horaLlegada;
        }



        public String getOrigin() {
            return origin;
        }

        public String getDestino() {
            return destino;
        }

        public String getHoraSalida() {
            return horaSalida;
        }

        public String getHoraLlegada() {
            return horaLlegada;
        }

        @Override
        public String toString() {
            return "Aereo{" +
                    "origin='" + origin + '\'' +
                    ", destino='" + destino + '\'' +
                    ", horaSalida='" + horaSalida + '\'' +
                    ", horaLlegada='" + horaLlegada + '\'' +
                    '}';
        }



    }


public class Turno {
    private Jugador[] jugadores;

    private int tieneTurno;

    public Turno(Jugador[] jugadores) {
        jugadores[0].setPieza(Pieza.X);
        jugadores[1].setPieza(Pieza.O);
        this.jugadores = jugadores;
        tieneTurno=0;
    }

    public void cambiarTurno(){
        tieneTurno = (tieneTurno+1) % jugadores.length;
    }

    public Jugador quienTieneTurno(){
        return jugadores[tieneTurno];
    }

}

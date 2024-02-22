// [TODO Desarrollar Tablero, Pieza, Casilla, Posicion, Movimiento y Jugador]


/**
 * Contiene todos los sucesos relacionados con una partida en un momento determinado:
 * jugadores y fichas asociadas, el jugador que le toca colocar una pieza, el tablero,
 * y el listado de movimientos (colocar piezas) realizados hasta ese momento.
 *
 * El número máximo de movimientos a almacenar en una partida es de 6
 */

import java.util.*;
class PartidaTresEnRaya implements Partida {
    // [TODO Definir atributos y métodos faltantes]

    private Turno turno;

    private Tablero tablero;

    ArrayList<Movimiento> historico;

    public PartidaTresEnRaya(Jugador jugador1, Jugador jugador2){
        turno = new Turno( new Jugador[] {jugador1,jugador2});
        tablero = new Tablero();
        historico = new ArrayList<>();
    }

    @Override
    public void mostrarEstadoPartida() {
        System.out.println("Jugadores: "+turno.getJugadores()[0]+"[X] "+turno.getJugadores()[1]+"[O] ");
        tablero.printTablero();
        System.out.println( "Le toca a: "+turno.quienTieneTurno().toString() );
        System.out.println("=================================================\n");
    }

    @Override
    public boolean ponerPieza(Pieza pieza, Posicion posicion) {
        if(pieza == turno.quienTieneTurno().getPieza()){
            historico.add( new Movimiento(turno.quienTieneTurno(), pieza, posicion) );
            tablero.colocarFicha(posicion,pieza);
            turno.cambiarTurno();
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public void mostrarHistoricoMovimientos() {
        System.out.println("Historico movimientos:");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println(historico.get(i).toString());
        }
    }
}


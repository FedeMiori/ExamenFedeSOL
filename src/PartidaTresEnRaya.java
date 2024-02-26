// [TODO Desarrollar Tablero, Pieza, Casilla, Posicion, Movimiento y Jugador]

import java.util.*;
class PartidaTresEnRaya implements Partida {
    private Jugador[] jugadores;
    private Turno turno;
    private Tablero tablero;
    private ArrayList<Movimiento> historico;

    public PartidaTresEnRaya(Jugador jugador1, Jugador jugador2){
        jugadores = new Jugador[] {jugador1,jugador2};
        turno = new Turno( jugadores );
        tablero = new Tablero();
        historico = new ArrayList<>();
    }

    @Override
    public void mostrarEstadoPartida() {
        System.out.println("Jugadores: "+jugadores[0]+"[X] "+jugadores[1]+"[O] ");
        tablero.printTablero();
        System.out.println( "Le toca a: "+turno.quienTieneTurno() );
        System.out.println("=================================================\n");
    }

    @Override
    public boolean ponerPieza(Pieza pieza, Posicion posicion) {
        if( piezaCorrecta(pieza) && casillaLibre(posicion) ){
            tablero.colocarFicha(posicion,pieza);
            historico.add( new Movimiento(turno.quienTieneTurno(), pieza, posicion) );
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
        for (Movimiento movimiento : historico) {
            System.out.println(movimiento.toString());
        }
    }

    private boolean piezaCorrecta(Pieza piezaPorComprobar){
        return turno.quienTieneTurno().getPieza() == piezaPorComprobar;
    }

    private boolean casillaLibre(Posicion posicionPorComprobar){
        return tablero.getCasilla( posicionPorComprobar ).estaVacia();
    }
}


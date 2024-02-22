public class Movimiento {
    private Jugador jugador;
    private Pieza pieza;
    private Posicion posicion;

    public Movimiento(Jugador jugador, Pieza pieza, Posicion posicion) {
        this.jugador = jugador;
        this.pieza = pieza;
        this.posicion = posicion;
    }

    @Override
    public String toString(){
        return jugador.toString()+" coloca: "+pieza.toString()+" en "+posicion.toString();
    }
}

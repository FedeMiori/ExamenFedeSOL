public interface Partida {
    /**
     * Muestra por consola el estado de una partida, en concreto, los jugadores con
     * las fichas asociadas, el tablero con sus fichas y el jugador que le toca colocar
     * la siguiente pieza.
     *
     */
    public void mostrarEstadoPartida();

    /**
     * Coloca una pieza en el tablero en la posición dada y cambia el jugador actual
     * al que le toca mover, siempre y cuando la pieza a colocar fuese sobre una casilla
     * vacía.
     *
     * Si ha habido éxito a la hora de poner una pieza, el movimiento queda registrado
     * en la partida dentro del listado de movimientos de la partida
     *
     * @param pieza			Pieza a colocar
     * @param posicion		Posición donde se debe colocar la pieza
     * @return			true si la pieza se ha podido colocar
     */
    public boolean ponerPieza(Pieza pieza, Posicion posicion);

    /**
     * Muestra por consola todos los movimientos actuales. En este caso, los movimientos
     * solo serán "colocar piezas", puesto que no vamos a moverlas.
     *
     * Los movimientos deben contener: el jugador que inició el movimiento,
     * la pieza que se colocó y la posición de la casilla donde se colocó
     * dicha pieza
     */
    public void mostrarHistoricoMovimientos();
}



public class JuegoTresEnRaya {
	public static void main(String[] args) {
		Partida partida = new PartidaTresEnRaya(new Jugador("Juan","García"),new Jugador("Ana")); //Jugador número 1. Arranca la partida y tendrá las piezas "X".
		partida.mostrarEstadoPartida(); // salida que produce:
		//Jugadores: Juan García [X] y Ana [O]
		//---
		//---
	    //---
		//Le toca al jugador: Juan García
		//=================================================

		partida.ponerPieza(Pieza.X,new Posicion(1,1));
		partida.mostrarEstadoPartida(); // salida que produce:
		//Jugadores: Juan García [X] y Ana [O]
		//---
		//-X-
		//---
		//Le toca al jugador: Ana		
		//=================================================

		partida.ponerPieza(Pieza.X, new Posicion(1,1));
		partida.mostrarEstadoPartida(); // salida que produce:
		//Jugadores: Juan García [X] y Ana [O]
		//---
		//-X-
		//---
		//Le toca al jugador: Ana
		//=================================================

		partida.ponerPieza(Pieza.O, new Posicion(0,0));
		partida.ponerPieza(Pieza.X, new Posicion(0,2));
		partida.ponerPieza(Pieza.O, new Posicion(1,0));
		partida.mostrarEstadoPartida(); // salida que produce:
		//Jugadores: Juan García [X] y Ana [O]
		//O-X
		//OX-
		//---
		//Le toca al jugador: Juan García
		//=================================================		

		partida.mostrarHistoricoMovimientos(); // Salida que produce:
		//Histórico de jugadas:
		//[Juan García coloca X en (1,1)]
		//[Ana coloca O en (0,0)]
		//[Juan García coloca X en (0,2)]
		//[Ana coloca O en (1,0)]
	}
}
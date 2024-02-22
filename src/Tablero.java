public class Tablero {
    private final int anchoTablero=3;
    private final int altoTablero=3;
    private Casilla[][] casillas=new Casilla[anchoTablero][altoTablero];

    public Tablero(){
        for (int i = 0; i < anchoTablero; i++) {
            for (int j = 0; j < altoTablero; j++) {
                casillas[i][j]=new Casilla();
            }
        }
    }

    public Casilla getCasilla(int x, int y){
        return casillas[x][y];
    }

    public void colocarFicha(Posicion posicion,Pieza pieza){
        casillas[posicion.getPosX()][posicion.getPosY()].setPieza( pieza );
    }

    public void printTablero(){
        for (int i = 0 ; i < altoTablero; i++) {
            for (int j = 0; j < anchoTablero; j++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int j = 0; j < anchoTablero; j++) {
                System.out.print("| "+casillas[i][j].toString()+" ");
            }
            System.out.println("|");
        }
        for (int j = 0; j < anchoTablero; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }
}

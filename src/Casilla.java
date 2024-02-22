public class Casilla {
    Pieza pieza;

    public Casilla(){
        this.pieza=null;
    }

    public Pieza getPieza(){
        return pieza;
    }

    public void setPieza(Pieza piezaEntrada){
        pieza = piezaEntrada;
    }

    public String toString(){
        if(pieza == null)
            return " ";
        else
            return pieza.toString();
    }
}

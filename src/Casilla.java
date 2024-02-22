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

    public boolean estaVacia(){
        return pieza == null;
    }

    @Override
    public String toString(){
        if(pieza == null)
            return " ";
        else
            return pieza.toString();
    }
}


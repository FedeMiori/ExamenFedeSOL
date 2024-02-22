public class Jugador {
    private String nombre;
    private String apellido;
    private Pieza pieza;

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Jugador(String nombre) {
        this(nombre,"");
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString(){
        return nombre+" "+apellido;
    }
}

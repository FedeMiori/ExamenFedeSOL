public class Posicion {
    private int posX;
    private int posY;

    public Posicion(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String toString(){
        return "("+posX+","+posY+")";
    }
}

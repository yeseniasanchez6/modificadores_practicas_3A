package paquete;

public class Clase1 {
    public int x;
    private int y;
    protected int z;
    int w; //Acceso por default

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    //Metodo con modificador de acceso por default
    void restW() {
        this.w -=20;
    }
    @Override
    public String toString() {
        return "Clase1 [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
    
}

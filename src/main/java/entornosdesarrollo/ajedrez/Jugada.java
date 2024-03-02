package entornosdesarrollo.ajedrez;
import java.util.*;

/**
 * @author Jorge Martínez Mostazo
 */
public class Jugada {

    /**
     * Default constructor
     */
    public Jugada(int fila,int col) {
        this.fila = fila;
        this.col = col;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    /**
     * 
     */
    private int fila;

    /**
     * 
     */
    private int col;

}
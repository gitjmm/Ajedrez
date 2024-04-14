package entornosdesarrollo.ajedrez;
import java.util.*;

/**
 * @author Jorge Martínez Mostazo
 */
public class Jugada {

    /**
     * Default constructor
     * @param fila
     * @param col
     */
    public Jugada(int fila,int col) {
        this.fila = fila;
        this.col = col;
    }

    /**
     *
     * @return
     */
    public int getFila() {
        return fila;
    }

    /**
     *
     * @param fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     *
     * @return
     */
    public int getCol() {
        return col;
    }

    /**
     *
     * @param col
     */
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
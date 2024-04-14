package entornosdesarrollo.ajedrez;
import java.util.*;

/**
 * @author Jorge Martínez Mostazo
 */
public class ControlJuego {

    /**
     * Default constructor
     */
    public ControlJuego() {
        tiempo_limite = 0;
        tiempo_a = 0;
        tiempo_b = 0;
    }
    
    /**
     *
     * @param tiempo_limite
     * @param tiempo_a
     * @param tiempo_b
     */
    public ControlJuego(int tiempo_limite,int tiempo_a, int tiempo_b) {
        this.tiempo_limite = tiempo_limite;
        this.tiempo_a = tiempo_a;
        this.tiempo_b = tiempo_b;
        this.turno = 1;
    }

    /**
     * 
     */
    private int tiempo_limite;

    /**
     * 
     */
    private int tiempo_a;

    /**
     * 
     */
    private int tiempo_b;

    /**
     * 
     */
    private int turno;

    /**
     * @param fila 
     * @param col 
     * @param filaFin 
     * @param colFin
     * @return 
     */
    public Jugada hacerMovimiento(int fila, int col, int filaFin, int colFin) {
            Jugada jugada = null;
            if (jugadaCorrecta(fila,col)==true){
                //Realizo jugada
                jugada = new Jugada(filaFin,colFin);
            }
            return jugada;
    }
    
             
    
    

    /**
     * @param fila 
     * @param col 
     * @return
     */
    public boolean jugadaCorrecta(int fila, int col) {
        // Comprobamos que fila y columna son correctas. 
        // 8 filas y 8 columnas (letras con char)
        if (fila >= 1 && fila <= 8 && col >= 1 && col <= 8){ 
            return true;
        }else{
            return false;
        }    
    }

    /**
     * @param fila 
     * @param col 
     * @return
     */
    public boolean mate(int fila, int col) {
        // Se considera mate si la posición está ocupada y otras comprobaciones
        Jugada jugada = new Jugada(fila,col);
        if (jugada.getFila() == fila && jugada.getCol() == col)
            return true;
        else 
            return false;
    }

    /**
     * 
     * @param tiempo_limite
     * @param tiempo_limite
     */
    public void iniciarPartida(int tiempo_limite) {
        // TODO implement here
        this.tiempo_limite = tiempo_limite;
    }

    /**
     * 
     */
    public void finalizarPartida() {
        // TODO implement here
        tiempo_limite = 0;
    }

    /**
     * 
     */
    public void gestionTurno() {
        // TODO implement here
        System.out.println("Tu turno es "+ this.turno);
        
    }

    /**
     * 
     */
    public void alerta() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Pieza consejoIA() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getTiempo_limite() {
        // TODO implement here
        return tiempo_limite;
    }

    /**
     * @param value
     */
    public void setTiempo_limite(int value) {
        // TODO implement here
        tiempo_limite = value;
    }

    /**
     * @return
     */
    public int getTiempo_a() {
        // TODO implement here
        return tiempo_a;
    }

    /**
     * @param value
     */
    public void setTiempo_a(int value) {
        // TODO implement here
        tiempo_a = value;
    }

    /**
     * @return
     */
    public int getTiempo_b() {
        // TODO implement here
        return tiempo_b;
    }

    /**
     * @param value
     */
    public void setTiempo_b(int value) {
        // TODO implement here
        tiempo_b = value;
    }

    /**
     * @return
     */
    public int getTurno() {
        // TODO implement here
        return turno;
    }

    /**
     * @param value
     */
    public void setTurno(int value) {
        // TODO implement here
        turno = value;
    }

}
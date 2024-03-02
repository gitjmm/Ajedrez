package entornosdesarrollo.ajedrez;
import java.util.*;

/**
 * @author Jorge Martínez Mostazo
 */
public class JugadorHumano extends Jugador {

    /**
     * Default constructor
     */
    public JugadorHumano() {
        this.nombre = "";
        this.password = "";
        this.preferencias = "";
    }
    
    public JugadorHumano(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String preferencias;

    
   

    /**
     * @param nombre 
     * @param password
     */
    public void registrarse(String nombre, String password) {
        // TODO implement here
        this.nombre = nombre;
        //Chequeo de password: longitud (se puede usar otro)
        if (password.length() >=8)
            this.password = password;
        else System.out.println("Registro incorrecto");
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return nombre;
    }

    /**
     * @param value
     */
    public void setNombre(String value) {
        // TODO implement here
        this.nombre = value;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param value
     */
    public void setPassword(String value) {
        // TODO implement here
        this.password = value;
    }

    /**
     * @return
     */
    public String getPreferencias() {
        // TODO implement here
        return preferencias;
    }

    /**
     * @param value
     */
    public void setPreferencias(String value) {
        
        this.preferencias = value;
    }

}
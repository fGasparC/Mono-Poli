/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoli;

import javax.swing.ImageIcon;

/**
 *
 * @author FG
 */
public class Jugador {
    private int dinero=1500;
    private int posicion=0;
    ImageIcon imagenJugador;
    

    public Jugador() {
        
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setImagenJugador(ImageIcon imagenJugador) {
        this.imagenJugador = imagenJugador;
    }

    public ImageIcon getImagenJugador() {
        return imagenJugador;
    }
    
    public String getDineroText(){
        String dineroText="";
        dineroText+=this.dinero;
        return dineroText;
    }
    
}

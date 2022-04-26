/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.tienda;

/**
 *
 * @author josue
 */
public class Computadora implements electronicos{
    private String Almacenamiento;
    private boolean tecladonumerico;
    private boolean altavoces;
    private boolean webcam;

    public Computadora() {
    }

    public Computadora(String Almacenamiento, boolean tecladonumerico, boolean altavoces, boolean webcam) {
        this.Almacenamiento = Almacenamiento;
        this.tecladonumerico = tecladonumerico;
        this.altavoces = altavoces;
        this.webcam = webcam;
    }

    public boolean isWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public boolean isTecladonumerico() {
        return tecladonumerico;
    }

    public void setTecladonumerico(boolean tecladonumerico) {
        this.tecladonumerico = tecladonumerico;
    }

    public boolean isAltavoces() {
        return altavoces;
    }

    public void setAltavoces(boolean altavoces) {
        this.altavoces = altavoces;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Almacenamiento=" + Almacenamiento + ", tecladonumerico=" + tecladonumerico + ", altavoces=" + altavoces + ", webcam=" + webcam + '}';
    }
    
    
}

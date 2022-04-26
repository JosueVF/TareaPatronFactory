/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.tienda;

/**
 *
 * @author josue
 */
public class Smartphone implements electronicos{
    private String resolucionCamara;
    private boolean pantallaAmoled;
    private boolean lectorDeHuella;
    private boolean cargaSuperRapida;

    public Smartphone() {
    }

    public Smartphone(String resolucionCamara, boolean pantallaAmoled, boolean lectorDeHuella, boolean cargaSuperRapida) {
        this.resolucionCamara = resolucionCamara;
        this.pantallaAmoled = pantallaAmoled;
        this.lectorDeHuella = lectorDeHuella;
        this.cargaSuperRapida = cargaSuperRapida;
    }

    public boolean isCargaSuperRapida() {
        return cargaSuperRapida;
    }

    public void setCargaSuperRapida(boolean cargaSuperRapida) {
        this.cargaSuperRapida = cargaSuperRapida;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    public boolean isPantallaAmoled() {
        return pantallaAmoled;
    }

    public void setPantallaAmoled(boolean pantallaAmoled) {
        this.pantallaAmoled = pantallaAmoled;
    }

    public boolean isLectorDeHuella() {
        return lectorDeHuella;
    }

    public void setLectorDeHuella(boolean lectorDeHuella) {
        this.lectorDeHuella = lectorDeHuella;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "resolucionCamara=" + resolucionCamara + ", pantallaAmoled=" + pantallaAmoled + ", lectorDeHuella=" + lectorDeHuella + ", cargaSuperRapida=" + cargaSuperRapida + '}';
    }
    
    
}

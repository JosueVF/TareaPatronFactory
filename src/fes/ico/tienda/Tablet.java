/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.tienda;

/**
 *
 * @author josue
 */
public class Tablet implements electronicos{
    private String tipoCargador;
    private boolean memoriaExpandible;
    private boolean camarafrontal;
    private boolean espacioParaChip;

    public Tablet() {
    }

    public Tablet(String tipoCargador, boolean memoriaExpandible, boolean camarafrontal, boolean espacioParaChip) {
        this.tipoCargador = tipoCargador;
        this.memoriaExpandible = memoriaExpandible;
        this.camarafrontal = camarafrontal;
        this.espacioParaChip = espacioParaChip;
    }

    public boolean isEspacioParaChip() {
        return espacioParaChip;
    }

    public void setEspacioParaChip(boolean espacioParaChip) {
        this.espacioParaChip = espacioParaChip;
    }

    public String getTipoCargador() {
        return tipoCargador;
    }

    public void setTipoCargador(String tipoCargador) {
        this.tipoCargador = tipoCargador;
    }

    public boolean isMemoriaExpandible() {
        return memoriaExpandible;
    }

    public void setMemoriaExpandible(boolean memoriaExpandible) {
        this.memoriaExpandible = memoriaExpandible;
    }

    public boolean isCamarafrontal() {
        return camarafrontal;
    }

    public void setCamarafrontal(boolean camarafrontal) {
        this.camarafrontal = camarafrontal;
    }

    @Override
    public String toString() {
        return "Tablet{" + "tipoCargador=" + tipoCargador + ", memoriaExpandible=" + memoriaExpandible + ", camarafrontal=" + camarafrontal + ", espacioParaChip=" + espacioParaChip + '}';
    }
    
}
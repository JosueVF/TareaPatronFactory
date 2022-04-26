/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.tienda;

/**
 *
 * @author josue
 */
public class eFactory {
    public static electronicos creaElectronico(int tipo){
        switch (tipo) {
            case electronicos.COMPU_HP_PK4VTF14:
                return new Computadora("128 GB", true, true, true);
            
            case electronicos.COMPU_MacBook_Air:
                return new Computadora("128 GB", false, true, false);    
            
            case electronicos.COMPU_Lenovo_IP114IGL:
                return new Computadora("256 GB", false, true, true);     
                
            case electronicos.SMARTPHONE_SAMSUMGS21:
                return new Smartphone("108 mpx", true, true, true);
                
            case electronicos.SMARTPHONE_iPHONE11:
                return new Smartphone("12 mpx", true, false, false);
                
            case electronicos.SMARTPHONE_MOTOG7:
                return new Smartphone("12 mpx", true, true, false);
                
            case electronicos.TABLET_MATEPADT10s:
                return new Tablet("Tipo c", false, false, false);
                
            case electronicos.TABLET_LENOVOtb8505f:
                return new Tablet("Micro USB", true, false, false);
                
            case electronicos.TABLET_GALAXYTABS6:
                return new Tablet("Tipo c", false, true, true);
          
            default:
                throw new AssertionError();
        }
    }
}

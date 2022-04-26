
package fes.ico.tienda;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Que electronico deseas?");
        System.out.println(electronicos.COMPU_HP_PK4VTF14 + " Computadora HP PK4VTF14");
        System.out.println(electronicos.COMPU_MacBook_Air + " Computadora MacBook Air");
        System.out.println(electronicos.COMPU_Lenovo_IP114IGL + " Computadora Lenovo IP114IGL");
        System.out.println(electronicos.SMARTPHONE_SAMSUMGS21 + " Telefono Samsumg galaxy S21");
        System.out.println(electronicos.SMARTPHONE_iPHONE11 + " Telefono iPHONE 11");
        System.out.println(electronicos.SMARTPHONE_MOTOG7 + " Telefono Motorola Moto G7");
        System.out.println(electronicos.TABLET_MATEPADT10s +" Tablet Huawei MATEPADT 10s");
        System.out.println(electronicos.TABLET_LENOVOtb8505f +" Tablet LENOVO tb8505f");
        System.out.println(electronicos.TABLET_GALAXYTABS6 +" Tablet Samsumg GALAXYTAB S6");
        
        try {
            System.out.print("Elige el numero: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        }
        
        electronicos elec = eFactory.creaElectronico(eleccion);
        System.out.println(elec.toString());
    }
}

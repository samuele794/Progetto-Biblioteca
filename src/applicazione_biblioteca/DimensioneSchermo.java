package applicazione_biblioteca;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3-5AINF
 */
public class DimensioneSchermo {
    
    private static double altezza;
    private static double larghezza;
    
    public static int altezza_schermoCentro(){
        Dimension dimensione_schermo = Toolkit.getDefaultToolkit().getScreenSize();
        altezza = dimensione_schermo.getHeight() / 2;
        return (int) altezza - 82;        
    }
    
    public static int larghezza_schermoCentro(){
        Dimension dimensione_schermo = Toolkit.getDefaultToolkit().getScreenSize();
        larghezza = dimensione_schermo.getWidth() / 2;
        return (int) larghezza - 92;        
    }
    
    public static double getAltezza() {
        return altezza;
    }

    public static void setAltezza(double altezza) {
        DimensioneSchermo.altezza = altezza;
    }

    public static double getLarghezza() {
        return larghezza;
    }

    public static void setLarghezza(double larghezza) {
        DimensioneSchermo.larghezza = larghezza;
    }   
}

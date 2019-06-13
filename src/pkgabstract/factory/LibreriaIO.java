/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory;

/**
 *
 * @author javiv
 */
public class LibreriaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LibreriaIOPadre obxnum = LibreriaIOPadre.crear(Tipo.VENTANA);
        
        obxnum.pedirNumInteger("introduce un numero ");
        
        LibreriaIOPadre obxnum2 = LibreriaIOPadre.crear(Tipo.CONSOLA);
        
        obxnum2.pedirNumShort("introduce un numero ");
        
    }
    
}
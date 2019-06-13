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
public abstract class LibreriaIOPadre implements InterfaceLibreriaIO{

    public static LibreriaIOPadre crear(Tipo tipo){
    
        LibreriaIOPadre variablelibreria=null;
        
    switch (tipo){
        case VENTANA:{
        variablelibreria = new LibreriaIOWind();
        break;
        }
        case CONSOLA:{
        variablelibreria = new LibreriaIOConsola();
        break;
        }  
        
        
    }
        return variablelibreria;
        
    
    
    
    
    }   
}

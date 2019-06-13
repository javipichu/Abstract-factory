/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory;

import java.util.Scanner;

/**
 *
 * @author javiv
 */
public class LibreriaIOConsola extends LibreriaIOPadre{

    @Override
    public Short pedirNumShort(String mensaje) {
       
        System.out.println(mensaje);
        
      Scanner ler = new Scanner(System.in);
      
      Short numShort = ler.nextShort();
      
      return numShort;
      
    }

    @Override
    public Integer pedirNumInteger(String mensaje) {
       
        System.out.println(mensaje);
        
      Scanner ler = new Scanner(System.in);
      
      Integer num = ler.nextInt();
      
      return num;
    }

    @Override
    public Double pedirNumDouble(String mensaje) {
        
    System.out.println(mensaje);
        
      Scanner ler = new Scanner(System.in);
      
      Double num = ler.nextDouble();
      
      return num;
    
    }
         
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.util;

import java.math.BigDecimal;
import zavrsnirad.model.Operater;

/**
 *
 * @author X
 */
public class Pomocno {
    
     public static final String NAZIV_APLIKACIJE = "ZAVRŠNI RAD";
    public static Operater operater;
    
    
    
    
    public static Integer randomKolicina(int min,int max){
          return min + (int)(Math.random() * ((max - min) + 1));
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edunova;



import edunova.util.PocetniInsert;
import edunova.view.SplashScreen;


/**
 *
 * @author X
 */
public class Start {

    public Start() {
        
        new PocetniInsert();
        new SplashScreen().setVisible(true);
    }

    
    
    
    
    public static void main(String[] args) {
        
        new Start();
        
    }
}

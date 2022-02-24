/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polyspace2;
import java.awt.*;
/**
 *
 * @author rafa
 */
public class Escenario {
    
    int x;
    int y;
    String fondo;
    Image img;
    
    public Escenario(String nombre){
        
        fondo = nombre;
        
    }
    
    public Image imgFondo(){
        img = Toolkit.getDefaultToolkit().getImage(fondo);
        return(img);
    }
    
    public void pintarFondo(Graphics g, ejemploImagen a1){
        
        if(img != null){
            g.drawImage(img, 1, 1, a1);
        }
        
    }
    
    
}

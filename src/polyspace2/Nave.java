
package polyspace2;
import java.awt.*;
/**
 *
 * @author rafa
 */
public class Nave {
    
    int x;
    int y;
    String imagenPersonaje;
    Image img;
    
    public Nave(String nombre){
        imagenPersonaje = nombre;
    }
    
    public Image imgPersonaje(){
        img = Toolkit.getDefaultToolkit().getImage(imagenPersonaje);
        return(img);
    }
    
    public void moverPersonaje(int x, int y){
        
        this.x = x;
        this.y = y;
        
        if(this.x >= 1100){
            this.x = 1000;
        }
        if(this.x <=0){
            this.x = 5;
        }
        if(this.y >= 550){
            this.y = 550;
        }
        if(this.y <= 5){
            this.y = 4;
        }
           
    }
    
    public void pintarPersonaje(Graphics g, ejemploImagen a1){
        
        if(img != null){
            g.drawImage(img, x, y, a1);
        }
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    
    
}

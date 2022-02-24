
package polyspace2;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author rafa
 */
public class ejemploImagen extends Frame implements KeyListener, MouseListener{

    
    Image img;//variable de imagen
    public static int x1 = 100;
    public static int y1 = 560;
    public static int tecla = 0;//tecla presionada
    public static int anteriorTecla = 0;
    Nave principal = new Nave("nave3.png");
    
    Image fondo;
    Escenario miEscenario = new Escenario("fondo.png");
    
    public static void main(String[] args) {
        
        ejemploImagen ai = new ejemploImagen();
        while(true){
            
            //flecha derecha
            if(tecla == 39){
                x1 += 6;
                anteriorTecla = tecla;
            }
            
            //flecha izquierda
            if(tecla == 37){
                x1 -= 6;
                anteriorTecla = tecla;
            }
            
            //flecha arriba
            if(tecla == 38){
                y1 -= 6;
                anteriorTecla = tecla;
            }
            
            //flecha abajo
            if(tecla == 40){
                y1 += 6;
                anteriorTecla = tecla;
            }
            
            if(tecla == 32){
                //activDisp = true;
                //disuna = true;
            }
            
            tecla = anteriorTecla;
            
            try{
                Thread.sleep(40);//espera
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            
            ai.repaint();//se repinta la animacion
        }
        
    }
    
    
    
    public ejemploImagen(){
        
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setBackground(Color.WHITE);
        
        img = principal.imgPersonaje();
        fondo = miEscenario.imgFondo();
        setSize(1366,768);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
         public void windowsClosing(WindowEvent we){
            dispose();
        }
        
    });
        
    }
    
    @Override
    public void update(Graphics g){
        paint(g);
    }
    
    @Override
    public void paint(Graphics g){
        miEscenario.pintarFondo(g, this);
        principal.moverPersonaje(x1, y1);
        principal.pintarPersonaje(g, this);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        tecla = e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e) {
            tecla = e.getKeyCode();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    
    
    

    
    
}

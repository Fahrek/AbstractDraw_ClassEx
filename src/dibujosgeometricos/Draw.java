package dibujosgeometricos;

import java.awt.Graphics;
import java.awt.Color;
//import javafx.scene.paint.Color;
import javax.swing.JPanel;

public class Draw extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        
        // Dibujar fachada (4 lados)
        Poligon p1 = new Poligon();
        
        int[] co1xs = {150, 220, 220, 150};
        int[] co1ys = {300, 300, 230, 230};
        
        p1.setnPoints(4);
        p1.setCoordX(co1xs);
        p1.setCoordY(co1ys);
        
        g.setColor(Color.red);
        g.fillPolygon(p1.PreparePolygon());
        
        // Dibujar tejado (3 lados)
        Poligon p2 = new Poligon();
        
        int[] co2xs = {130, 185, 240};
        int[] co2ys = {230, 180, 230};
        
        p2.setnPoints(3);
        p2.setCoordX(co2xs);
        p2.setCoordY(co2ys);
        
        g.setColor(Color.red);
        g.fillPolygon(p2.PreparePolygon());
        
        // Dibujar circulo
        Oval o1 = new Oval();
        
        o1.setPointX(135);
        o1.setPointY(105);
        o1.setHeight(100);
        o1.setWidth(100);
        
        g.setColor(Color.red);
        g.fillOval(o1.getPointX(), o1.getPointY(), o1.getHeight(), o1.getWidth());
        
        // Dibujar recta
        Straight s1 = new Straight();
        
        s1.setInitialPoint(new Point(0,300));
        s1.setFinalPoint(new Point(400,300));
        
        g.setColor(Color.red);
        g.fillRect(s1.getInitialPoint().getPointX(), s1.getFinalPoint().getPointY(), 400, 200);
    }
}

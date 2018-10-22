package dibujosgeometricos;

import javax.swing.JFrame;

public class DibujosGeometricos 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Our draw");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw canvas = new Draw();
        frame.add(canvas);
        frame.setSize(400, 400);
        frame.setVisible(true);
    } 
}

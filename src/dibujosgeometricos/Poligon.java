package dibujosgeometricos;

import java.awt.Polygon;

public class Poligon {
    private int nPoints;
    private int[] coordX;
    private int[] coordY;
    
    public Poligon(){}

    public Poligon(int nPoints, int[] coordX, int[] coordY) {
        this.nPoints = nPoints;
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    public Polygon PreparePolygon()
    {
        return new Polygon(this.getCoordX(), this.getCoordY(), this.getnPoints());
    }

    public int getnPoints() {
        return nPoints;
    }
    public int[] getCoordX() {
        return coordX;
    }
    public int[] getCoordY() {
        return coordY;
    }

    public void setnPoints(int nPoints) {
        this.nPoints = nPoints;
    }
    public void setCoordX(int[] coordX) {
        this.coordX = coordX;
    }
    public void setCoordY(int[] coordY) {
        this.coordY = coordY;
    }
}

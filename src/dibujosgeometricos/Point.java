package dibujosgeometricos;

public class Point 
{
    // Atributos
    private int pointX;
    private int pointY;
    
    // Constructor por defecto
    public Point(){}

    //Constructor sobreescrito
    public Point(int pointX, int pointY) 
    {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    // Metodos de acceso a los atributos (getters, accessors)
    public int getPointX() 
    {
        return pointX;
    }
    public int getPointY() 
    {
        return pointY;
    }
    
    // Metodos de modificación de los atributos (setters, mutators)
    public void setPointX(int pointX) 
    {
        this.pointX = pointX;
    }
    public void setPointY(int pointY) 
    {
        this.pointY = pointY;
    } 
}

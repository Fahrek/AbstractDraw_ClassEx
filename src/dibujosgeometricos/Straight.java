package dibujosgeometricos;

public class Straight 
{
    private Point initialPoint;
    private Point finalPoint;
    
    public Straight(){}

    public Straight(Point initialPoint, Point finalPoint) 
    {
        this.initialPoint = initialPoint;
        this.finalPoint = finalPoint;
    }

    public Point getInitialPoint() 
    {
        return initialPoint;
    }
    public Point getFinalPoint() 
    {
        return finalPoint;
    }

    public void setInitialPoint(Point initialPoint) 
    {
        this.initialPoint = initialPoint;
    }
    public void setFinalPoint(Point finalPoint) 
    {
        this.finalPoint = finalPoint;
    }
}

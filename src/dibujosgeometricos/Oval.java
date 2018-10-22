package dibujosgeometricos;

public class Oval 
{
    private int pointX;
    private int pointY;
    private int width;
    private int height;

    public Oval() {}

    public Oval(int pointX, int pointY, int width, int height) 
    {
        this.pointX = pointX;
        this.pointY = pointY;
        this.width = width;
        this.height = height;
    }

    public int getPointX() 
    {
        return pointX;
    }
    public int getPointY() 
    {
        return pointY;
    }
    public int getWidth() 
    {
        return width;
    }
    public int getHeight() 
    {
        return height;
    }

    public void setPointX(int pointX) 
    {
        this.pointX = pointX;
    }
    public void setPointY(int pointY) 
    {
        this.pointY = pointY;
    }
    public void setWidth(int width) 
    {
        this.width = width;
    }
    public void setHeight(int height) 
    {
        this.height = height;
    } 
}

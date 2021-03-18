public class Cereal
{
    private String name;
    private double fiber;
    public Cereal()
    {
        name = "";
        fiber = 0.0;
    }
    public Cereal(String name, double fiber)
    {
        this.name = name;
        this.fiber = fiber;
    }
    public Cereal(String name)
    {
        this.name = name;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setFiber(double fiber)
    {
        this.fiber = fiber;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public double getFiber()
    {
        return fiber;
    }

    //toString
    public String toString()
    {
        return name + ", " + fiber;
    }
}
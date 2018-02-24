package Superpowers;

public class Flash extends SuperHuman implements MoveLightningSpeed
{

    int speed = 0;

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public Integer getSpeed()
    {
        return speed;
    }

    public void moves()
    {
        setSpeed(speed + 1000);
    }


}

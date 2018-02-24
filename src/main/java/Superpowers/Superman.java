package Superpowers;

public class Superman extends SuperHuman implements Flyer, DeflectBullets
{
    private int flightHeight = 0;
    private int bulletsDeflected = 0;
    /*
    Here we are using Superman to implement his own special methods pertaining
    to himself.*/

    public void setFlightHeight(int flightHeight)
    {
        this.flightHeight = flightHeight;
    }

    public Integer getFlightHeight()
    {
        return flightHeight;
    }

    public void fly()
    {
        setFlightHeight(flightHeight + 1);
    }

    public void setBulletsDeflected(int bulletsDeflected)
    {
        this.bulletsDeflected = bulletsDeflected;
    }

    public Integer getBulletsDeflected()
    {
        return bulletsDeflected;
    }

    public void deflectBullets()
    {
        setBulletsDeflected(bulletsDeflected + 1);
    }
}


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by Notebook on 2017-03-30.
 */
public class Vector2D {


    public float x,y;

    public Vector2D addVector(Vector2D parametr )
    {
        return new Vector2D((this.x+parametr.x),(this.y+parametr.y));

    }
    public Vector2D substractVector(Vector2D parametr )
    {
        return new Vector2D((this.x-parametr.x),(this.y-parametr.y));

    }
    public Vector2D multiplyVector(float stala )
    {
        return new Vector2D((stala*this.x),(stala*this.y));

    }

    public double lengthVector()
    {
        return sqrt(((pow(this.x,2))+(pow(this.y,2))));
    }
    //normalizowac znaczy dzielic wspolrzedna przez jego dlugosc
    public Vector2D normalizedVector()
    {
        return new Vector2D((float)(this.x/this.lengthVector()),(float)(this.y/this.lengthVector()));
    }

    Vector2D()
    {
        this.x=0;
        this.y=0;
    }
    Vector2D(float x, float y)
    {
        this.x=x;
        this.y=y;
    }


}

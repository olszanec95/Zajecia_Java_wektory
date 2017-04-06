
/**
 * Created by Notebook on 2017-04-04.
 */
import javax.swing.JApplet;
import java.awt.*;

import static java.lang.Math.getExponent;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.atan;
import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

public class SpringApplet extends JApplet{

    @Override
    public void init(){
    }

    public void paint(Graphics g) {
        Vector2D vector1 = new Vector2D(-120, 180);
        Vector2D vector2 = new Vector2D(180, -25);

        Vector2D vector3=vector1.substractVector(vector2);
        Vector2D vector4=vector1.addVector(vector2);

        drawAxis(g, "Wykres wektorów", 2);

        g.setColor(Color.GREEN);
        drawLine(g,vector2);
        drawLine(g,vector1);
        g.setColor(Color.RED);
        drawLine(g,vector3);
        g.setColor(Color.BLUE);
        drawLine(g,vector4);


    }



    public void drawLine(Graphics g, Vector2D vector)
    {
        int x1_grota=getSize().width/2 + (int)vector.x;
        int y1_grota=getSize().height/2 -(int)vector.y;
        int x1=(x1_grota<getSize().width/2)?x1_grota+10:x1_grota-10;
        int y1=(y1_grota<getSize().height/2)?y1_grota+3 :y1_grota-10 ;
        int[] tabx={x1_grota,x1,x1_grota};
        int[] taby={y1_grota,y1,y1_grota+10};
        g.drawLine(getSize().width/2, getSize().height/2, getSize().width/2 + (int)vector.x,
                getSize().height/2 -(int)vector.y);
        g.drawString("x: " + vector.x + " y: " + vector.y,
                getSize().width/2 + (int)vector.x+10, getSize().height/2 -(int)vector.y -15);
        g.fillPolygon(tabx,taby ,3);
    }



    public void drawAxis(Graphics g, String title, int a){
        g.drawString(title, 175, 20);


        g.setColor(Color.LIGHT_GRAY);

        for(int i =getSize().width/2,j=i; i <(getSize().height-50) && j>50 ; i+=10,j-=10){
            g.drawLine(i, 50, i,
                    (getSize().height)-50);
            g.drawLine(j, 50, j,
                    (getSize().height)-50);
        }
        for(int i =getSize().height/2,j=i; i <(getSize().height-50) && j>50 ; i+=10,j-=10){
            g.drawLine(50, i,
                    (getSize().height)-50,i);
            g.drawLine( 50, j,
                    (getSize().height)-50,j);
        }



        g.setColor(Color.DARK_GRAY);

        g.drawLine(getSize().width/2, 50, getSize().width/2, getSize().height - 50);
        g.drawLine(getSize().width/2, 50, (getSize().width/2)+10, 70);
        g.drawLine(getSize().width/2, 50, (getSize().width/2)-10, 70);

        g.drawLine(50, (getSize().height)/2, getSize().width - 50, (getSize().height)/2);
        g.drawLine(getSize().width - 50, (getSize().height)/2, getSize().width - 70, (getSize().height)/2 + 10);
        g.drawLine(getSize().width - 50, (getSize().height)/2, getSize().width - 70, (getSize().height)/2 - 10);

        g.setColor(Color.BLACK);
    }


}

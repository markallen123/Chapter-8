

import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1] (80, 60)
   point 3 - Top    C x[2],y[2] (400, 40)
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   
   //Mark Allen  Period: 3   Ap Computer Science
   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
       double a = Math.pow((xPos[1]+(xPos[0]-xPos[1])/2)-(xPos[2]+(xPos[1]-xPos[2])/2),2);
       double b = Math.pow((yPos[1]+(yPos[0]-yPos[1])/2)-(yPos[2]+(yPos[1]-yPos[2])/2),2);

        //if the segment/distance is 300 or so, good length to   stop
        if(Math.sqrt(a+b) <= 10)
        {
            return;
        }
        else
        {
            int[] xMid = new int[3];
            int[] yMid = new int[3];
            
            xMid[0] = (xPos[1]+(xPos[0]-xPos[1])/2);
            xMid[1] = (xPos[2]+(xPos[1]-xPos[2])/2);
            xMid[2] = (xPos[3]+(xPos[2]-xPos[3])/2);
            
            yMid[0] = (yPos[1]+(yPos[0]-yPos[1])/2);
            yMid[1] = (yPos[2]+(yPos[1]-yPos[2])/2);
            yMid[2] = (yPos[3]+(yPos[2]-yPos[3])/2);
            
            page.drawLine(xMid[0],yMid[0],xMid[1],yMid[1]);
            page.drawLine(xMid[1],yMid[1],xMid[2],yMid[2]);
            page.drawLine(xMid[2],yMid[2],xMid[0],yMid[0]);
            
            int[] xNext1 = new int[]{xMid[2],xMid[1],xPos[2],xMid[2]};
            int[] yNext1 = new int[]{yMid[2],yMid[1],yPos[2],yMid[2]};
            
            int[] xNext2 = new int[]{xPos[0],xMid[0],xMid[2],xPos[0]};
            int[] yNext2 = new int[]{yPos[0],yMid[0],yMid[2],yPos[0]};
            
            int[] xNext3 = new int[]{xMid[0],xPos[1],xMid[1],xMid[0]};
            int[] yNext3 = new int[]{yMid[0],yPos[1],yMid[1],yMid[0]};
           
            Triangle(xNext1, yNext1,page);
            Triangle(xNext2, yNext2,page);
            Triangle(xNext3, yNext3,page);
            
        }
        //{
            //find the mid points of each line segment


            //make the x and y array (3 points + first point to finish triangle)


            //draw the Triangle
            //page.drawPolyline (xNew, yNew, xNew.length);

            //create x,y Array using the midpoints you calculated
            //example




            // Recursive calls for each section of triangle



        //}



   }//end of Triangle
}

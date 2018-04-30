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
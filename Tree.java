public class Tree extends Applet{

int x,y,x1,x2,y1,y2;
int width,height;
int len,temp1 = 0,temp2 = 0;

double bran,count;
int ang;
double rand;

Image page;
Graphics draw;

public void init(){
    width = 1000;
    height = 600;
    setSize(width,height);
    setBackground(Color.black);

    count = 21;
    bran = 50;
    //ang = 10;

    page = createImage(width,height);
    draw = page.getGraphics();

    x = width/2;
    y = height;

    x1=x;
    y1=y;

    x2=x1;
    y2=y1-100;

}

public void paint(Graphics g){
    draw.setColor(Color.green);
    branch(draw,x2,y2,20);
    g.drawImage(page,0,0,width,height,this);


}

public void branch(Graphics g,int x,int y,int ang){
    count-=1;

    if(count%2 == 0)
        bran-=2;

    if(count == 20){
        g.drawLine(x1,y1,x2,y2);
    }
    else if(count > 0){
        x1 = x;
        y1 = y;

        rand = ang * (Math.PI/180);

        int xChange = (int) (Math.sin(rand)*bran); 
        int yChange = (int) (Math.cos(rand)*bran);
        y2 = y-yChange;

        /*System.out.printf("X1 | %3d \t X2 | %3d \t Y | %3d \t ChangeX | %3d \t ChangeY | %3d \n",
                x1-xChange,x1+xChange,y2,xChange,yChange);*/


        g.setColor(Color.blue);
        g.drawLine(x1,y1,x1-xChange,y2);
        g.setColor(Color.orange);
        g.drawLine(x1,y1,x1+xChange,y2);            

        branch(g,x1-xChange,y2,ang+10);

        temp1++;
        System.out.print("End1 | "+temp1);

        branch(g,x1+xChange,y2,ang+10);

        temp2++;
        System.out.println("\tEND2 | "+temp2);
    }
}//End of branch
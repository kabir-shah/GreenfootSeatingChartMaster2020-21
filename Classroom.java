import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
  /**
     * Write a description of class Classroom here.
       * 
         * @author (your name) 
       * @version (a version number or a date)
         */
        public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 
        //drawMultiple(30); //how many circles to draw
        prepareRohan();
    }
    
    
    public void drawMultiple(int howMany)
    {
        int i = 0;
       while (i < howMany)
        {
            drawOne();
            i = i+1;
        }
    }
    
    public void drawOne()
    {
        GreenfootImage image = getBackground();
        int x = Greenfoot.getRandomNumber(1225);
        int y = Greenfoot.getRandomNumber(675);
        int r = Greenfoot.getRandomNumber(256);
        int g = Greenfoot.getRandomNumber(256);
        int b = Greenfoot.getRandomNumber(256);
        int t = Greenfoot.getRandomNumber(255);
        Color color = new Color (r, g, b, t);
        int size = Greenfoot.getRandomNumber(150) + 100;
        image.setColor(color);
        image.fillOval(x, y, size, size);
    }
    
    
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
    //private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
    //    KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
   //    addObject(kilgoretrout, 1, 1);
    //    kilgoretrout.sitDown();
    //    WhiteBoard board = new WhiteBoard();
        //    addObject(board, board.getXloc(),board.getYloc());  // The whiteboard should be added last so that it is on tap of
                                                            // other images.
   //     addObject(board, 5,3); 
        
 
    }
    
     //getters/setters
     
         private void prepareRohan()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
        RohanGovindarajan rohangovindarajan = new RohanGovindarajan("rohan", "govindarajan", 5, 5);
        addObject(rohangovindarajan, 5, 5);
        rohangovindarajan.sitDown();
        
        
        //    addObject(board, board.getXloc(),board.getYloc());  // The whiteboard should be added last so that it is on tap of
                                                            // other images.
    }  
}
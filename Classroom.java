import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Sets the size of the classroom and the location of the objects placed in it.
 * 
 * @author Karen Zhao 
 * @version August 10, 2020
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

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();
         
        KarenZhao karenzhao = new KarenZhao("Karen", "Zhao", 3, 3);
        addObject(karenzhao, 3, 3);
        karenzhao.sitDown();


    }  
}
